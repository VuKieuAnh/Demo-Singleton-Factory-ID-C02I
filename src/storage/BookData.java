package storage;

import model.Book;

import java.io.IOException;
import java.util.List;

public interface BookData {
    List<Book> getData();
    void setData(List<Book> books);
}