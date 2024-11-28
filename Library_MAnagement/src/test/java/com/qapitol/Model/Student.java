package com.qapitol.Model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private String mbNo;
    private List<Address> addresses;
    private List<Book> books;

    public Student(int id, String name, int age, String mbNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mbNo = mbNo;
        this.addresses = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMbNo() {
        return mbNo;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void updateDetails(String name, int age, String mbNo) {
        this.name = name;
        this.age = age;
        this.mbNo = mbNo;
    }
}









































//    private String id;
//    private String name;
//    private int age;
//    List<Address> address;
//
//    public String getId()
//    {return id;}
//    public void setId(String id)
//    {this.id = id;}
//    public String getName()
//    {return name;}
//    public void setName(String name)
//    {this.name = name;}
//    public int getAge()
//    {return age;}
//    public void setAge(int age)
//    {this.age = age;}
//    public List<Address> getAddress()
//    {return address;}
//    public void setAddress(List<Address> address)
//    {this.address = address;}

