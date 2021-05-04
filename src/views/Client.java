package views;

import controller.BookFactory;
import model.Book;
import model.FictionBook;
import model.ProgrammingBook;
import model.TypeOfBook;

public class Client {
    public static void main(String[] args) {
        Book b1 = BookFactory.getBook(TypeOfBook.Programming, 1, "Java1", "Luc", 2);
        Book b2 = new ProgrammingBook();
    }
}