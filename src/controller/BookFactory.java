package controller;

import model.Book;
import model.FictionBook;
import model.ProgrammingBook;
import model.TypeOfBook;

public class BookFactory {

    private BookFactory() {
    }

    public static Book getBook(TypeOfBook typeOfBook,
                               int id,
                               String name,
                               String author,
                               int price){
        Book b = null;
        switch (typeOfBook){
            case Fiction:
                b = new FictionBook(id, name, author, price);
                break;
            case Programming:
                b= new ProgrammingBook(id, name, author, price);
                break;

        }
        return b;
    }

}