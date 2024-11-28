package com.qapitol.Util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qapitol.Model.Book;
import com.qapitol.Model.Student;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {

    private static final String STUDENTS_FILE = "C:\\Users\\Qapitol QA\\Git-ops\\Library_MAnagement\\src\\test\\java\\com\\qapitol\\Util\\students.json";
    private static final String BOOKS_FILE = "C:\\Users\\Qapitol QA\\Git-ops\\Library_MAnagement\\src\\test\\java\\com\\qapitol\\Util\\books.json";
    private static final ObjectMapper mapper = new ObjectMapper();


    public static void saveStudents(List<Student> students) {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(STUDENTS_FILE), students);
            System.out.println("Students saved successfully to " + STUDENTS_FILE);
        } catch (IOException e) {
            System.err.println("Error saving students: " + e.getMessage());
        }
    }


    public static List<Student> loadStudents() {
        try {
            File file = new File(STUDENTS_FILE);
            if (file.exists()) {
                return List.of(mapper.readValue(file, Student[].class));
            }
        } catch (IOException e) {
            System.err.println("Error loading students: " + e.getMessage());
        }
        return List.of();
    }

    public static void saveBooks(List<Book> books) {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(BOOKS_FILE), books);
            System.out.println("Books saved successfully to " + BOOKS_FILE);
        } catch (IOException e) {
            System.err.println("Error saving books: " + e.getMessage());
        }
    }

    public static List<Book> loadBooks() {
        try {
            File file = new File(BOOKS_FILE);
            if (file.exists()) {
                return List.of(mapper.readValue(file, Book[].class));
            }
        } catch (IOException e) {
            System.err.println("Error loading books: " + e.getMessage());
        }
        return List.of(); // Return an empty list if no file or error
    }
}
























    //    private static final Gson gson = new Gson();
//
//
//    public static void writeToJsonFile(String fileName, List<String> list) {
//        try (Writer writer = new FileWriter(fileName)) {
//            gson.toJson(list, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static <T> List<T> readFromJsonFile(String fileName, Class<T> clazz) {
//        try (Reader reader = new FileReader(fileName)) {
//            Type type = TypeToken.getParameterized(List.class, clazz).getType();
//            return gson.fromJson(reader, type);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//}}
