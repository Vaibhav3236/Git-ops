package com.qapitol.Services;

import com.qapitol.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class Book_Service {
   private List<Book> books;

    public Book_Service() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(int id) {
        return books.stream().filter(book -> book.getBookID() == id).findFirst().orElse(null);
    }

    public boolean updateBookData(int id, String subject, int count) {
        Book book = getBookById(id);
        if (book != null) {
            book.updateDetails(subject, count);
            return true;
        }
        return false;
    }

    public boolean removeBook(int id) {
        Book book = getBookById(id);
        if (book != null) {
            books.remove(book);
            return true;
        }
        return false;
    }
}
