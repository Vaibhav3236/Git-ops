package com.qapitol.Services;

import com.qapitol.Model.Book;
import com.qapitol.Model.Student;
import com.qapitol.Util.JsonUtil;

import java.util.ArrayList;
import java.util.List;

public class Student_service {
   private List<Student> students;

    public Student_service() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    public boolean updateStudentDetails(int id, String newName, int newAge, String newMbNo) {
        Student student = getStudentById(id);
        if (student != null) {
            student.updateDetails(newName, newAge, newMbNo);
            JsonUtil.saveStudents(getAllStudents());
            System.out.println("Student updated and JSON file saved successfully!");
            return true;
        }
        System.out.println("Student with id"+id+" not found");
        return false;
    }

    public boolean removeStudent(int id) {
        Student student = getStudentById(id);
        if (student != null) {
            getAllStudents().remove(student);
            JsonUtil.saveStudents(getAllStudents());
            System.out.println("Student removed");
            return true;
        }
        return false;
    }

    public boolean borrowBook(int studentId, int bookId, Book_Service bookService) {
        Student student = getStudentById(studentId);
        Book book = bookService.getBookById(bookId);

        if (student != null && book != null && book.getBookCount() > 0) {
            book.borrowBook(student);
            student.addBook(book);
            return true;
        }
        return false;
    }
}
