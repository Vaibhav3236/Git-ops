package com.qapitol.library;

import com.qapitol.Model.Book;
import com.qapitol.Model.Student;
import com.qapitol.Services.*;
import com.qapitol.Util.JsonUtil;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
      Student_service studentService = new Student_service();
        Book_Service bookService = new Book_Service();

        studentService.getAllStudents().addAll(JsonUtil.loadStudents());
        bookService.getAllBooks().addAll(JsonUtil.loadBooks());

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Student Operation");
            System.out.println("7. Remove student");
            System.out.println("2. Update student");
            System.out.println("3. Get All Students");
            System.out.println("6. Borrow Book");
            System.out.println("4. Add Book");
            System.out.println("5. Get All Books");
            System.out.println("8. Save and Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Mobile Number: ");
                    String mbNo = scanner.next();
                    studentService.addStudent(new Student(id, name, age, mbNo));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("Enter student_id to update:");
                    int new_id= scanner.nextInt();
                    System.out.print("Enter updatedName: ");
                    String newName = scanner.next();
                    System.out.print("Enter update_Age: ");
                    int newAge = scanner.nextInt();
                    System.out.print("Enter new_Mobile Number: ");
                    String newMbNo = scanner.next();
                   if(studentService.updateStudentDetails( new_id,newName,  newAge, newMbNo))
                {
                    System.out.println("Student updated successfully");
                }else {
                       System.out.println("Update failed");
                   }
                    break;

                case 3:
                    for (Student student : studentService.getAllStudents()) {
                        System.out.println(student.getId() + ": " + student.getName());
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter Subject: ");
                    String subject = scanner.next();
                    System.out.print("Enter Book Count: ");
                    int bookCount = scanner.nextInt();
                    bookService.addBook(new Book(bookId, subject, bookCount));
                    System.out.println("Book added successfully!");
                    break;

                case 5:
                    for (Book book : bookService.getAllBooks()) {
                        System.out.println(book.getBookID() + ": " + book.getSubject() + " (" + book.getBookCount() + " available)");
                    }
                    break;

                case 6:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextInt();
                    if (studentService.borrowBook(studentId, bookId, bookService)) {
                        System.out.println("Book borrowed successfully!");
                    } else {
                        System.out.println("Failed to borrow book.");
                    }
                    break;

                case 7:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = scanner.nextInt();
                    if (studentService.removeStudent(removeId)) {
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Failed to remove student.");
                    }
                    break;
                case 8:
                    JsonUtil.saveStudents(studentService.getAllStudents());
                    JsonUtil.saveBooks(bookService.getAllBooks());
                    System.out.println("Data saved. Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice!=8);

        scanner.close();
    }
    }

