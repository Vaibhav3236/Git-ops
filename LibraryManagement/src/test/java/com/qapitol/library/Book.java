package com.qapitol.library;

public class Book {
    private int book_id;
    private String book_name;
    private String author;
    private int book_count;
    private String sub_name;

    public int getBook_id() {
        return book_id;
    }
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
    public String getBook_name() {
        return book_name;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getBook_count()
    {return book_count;}
    public void setBook_count(int book_count)
    {this.book_count = book_count;}
    public String getSub_name()
    {return sub_name;}
    public void setSub_name(String sub_name)
    {this.sub_name = sub_name;}

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                ", book_count=" + book_count +
                ", sub_name='" + sub_name + '\'' +
                '}';
    }
}
