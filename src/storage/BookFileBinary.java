package storage;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookFileBinary implements BookData {
    private BookFileBinary() {
    }

    private static BookFileBinary INSTANCE;

    public static BookFileBinary getINSTANCE(){
        if (INSTANCE == null) INSTANCE = new BookFileBinary();
        return INSTANCE;
    }

    @Override
    public List<Book> getData(){
        File file = new File("list.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(file.length() >0 ){
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Object o = null;
            try {
                o = ois.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            List<Book> books = (List<Book>) o;
            return books;

        }
        return new ArrayList<>();
    }

    @Override
    public void setData(List<Book> books) {
        File file = new File("list.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        objectOutputStream.close();
//        fileOutputStream.close();


    }
}