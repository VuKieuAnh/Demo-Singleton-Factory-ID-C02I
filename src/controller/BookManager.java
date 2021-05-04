package controller;

import model.Book;
import storage.BookData;
import storage.BookFileBinary;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    BookData bookData = BookFileBinary.getINSTANCE();
    List<Book> list = new ArrayList<>();

    public void addNewBook(Book b){
        list.add(b);
        bookData.setData(list);
    }

    public List<Book> getList() {
        list = bookData.getData();
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }
}