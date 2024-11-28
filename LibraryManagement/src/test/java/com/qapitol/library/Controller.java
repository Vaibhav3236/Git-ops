package com.qapitol.library;


import java.util.ArrayList;
import java.util.Scanner;


public class Controller {
    private ArrayList<Book> books;
    private ArrayList<Student> students;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int selection;
        do {
            System.out.println("Index");
            System.out.println("1:Student operations");
            System.out.println("2:Add Book deatils");
            System.out.println("3:Add transaction");
            System.out.println("4:Exit");
            System.out.println("Enter your selection");
            selection=sc.nextInt();

            if (selection==4){
                System.out.println("Exit");
                break;
            }

        switch (selection){
            case 1:
                System.out.println("Choose your operation");
                System.out.println("1:Add student");
                System.out.println("2:Remove student");
                System.out.println("3:Search student by id");
                System.out.println("4:Update student");
                System.out.println("5:Exit");
                int choice=sc.nextInt();
                if (choice==5)
                {
                    System.out.println("Exit");
                    break;
                }
                switch (choice){
                    case 1:
                        System.out.println("Enter student id");
                       int id=sc.nextInt();
                        System.out.println("Enter student name");
                        String name =sc.next();
                        System.out.println("Enter student age");
                        int age=sc.nextInt();
                        System.out.println("Enter student address");
                        Address address1=new Address();
                        System.out.println("Enter street_name");
                        address1.setStreet_name(sc.next());
                        System.out.println("Enter complete_address");
                        address1.setComplete_addr(sc.next());
                        System.out.println("Enter pin_code");
                        address1.setPin_code(sc.nextLong());
                        System.out.println("Student details successfully added");
                        break;

                    case 2:
                        System.out.println("Enter std_id to remove details");
                        Controller controller=new Controller();
                        boolean b = controller.deleteStdById(sc.nextInt());
                        System.out.println("Student removed successfully");
                        break;

                }
                
    }
        }
        while (selection!=5);
        {
            sc.close();
        }
    }

    public boolean deleteStdById(int id)
    {
        for (Student student:students)
        {
            if (student.getId()==id)
            {
                students.remove(student);
                System.out.println("Student with id"+id+" is been removed");
            }
            else {
                System.out.println("Student id not found");
            }
        }
        return false;
    }
}

