package com.qapitol.Model;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int bookID;
    private String subject;
    private int bookCount;
    private List<Student> borrowers;

    public Book(int bookID, String subject, int bookCount) {
        this.bookID = bookID;
        this.subject = subject;
        this.bookCount = bookCount;
        this.borrowers = new ArrayList<>();
    }

    public int getBookID() {
        return bookID;
    }

    public String getSubject() {
        return subject;
    }

    public int getBookCount() {
        return bookCount;
    }

    public List<Student> getBorrowers() {
        return borrowers;
    }

    public void borrowBook(Student student) {
        if (bookCount > 0) {
            bookCount--;
            borrowers.add(student);
        }
    }

    public void returnBook(Student student) {
        bookCount++;
        borrowers.remove(student);
    }

    public void updateDetails(String subject, int bookCount) {
        this.subject = subject;
        this.bookCount = bookCount;
    }
}
















    //    private String bookID;
//    private String subject;
//    private int bookCount;
//    private List<Student> students;
//
//    // Getter and Setter methods
//    public String getBookID() {
//        return bookID;
//    }
//
//    public void setBookID(String bookID) {
//        this.bookID = bookID;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public int getBookCount() {
//        return bookCount;
//    }
//
//    public void setBookCount(int bookCount) {
//        this.bookCount = bookCount;
//    }
//
//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//}

