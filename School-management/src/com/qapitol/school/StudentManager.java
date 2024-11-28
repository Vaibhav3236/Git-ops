package com.qapitol.school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int selection;
        do {
            System.out.println("Menu");
            System.out.println("1:Add Teacher");
            System.out.println("2:Add Student");
            System.out.println("3:Exit");
            System.out.println("Enter your selection");
        selection=sc.nextInt();

        if (selection==3) {
            System.out.println("Exit");
            break;
        }

        switch (selection){
            case 1:
                System.out.println("Enter teacher id");
                int id=sc.nextInt();
                System.out.println("Enter Teacher Name");
                String name=sc.next();
                System.out.println("Enter Teacher age");
                int age=sc.nextInt();
                System.out.println("Enter subject");
                String subject=sc.next();
                System.out.println("Enter salary");
                double salary=sc.nextDouble();

                Teacher teacher=new Teacher();
    teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setSubTeacher(subject);
        teacher.setSalary(salary);
        teacher.displayData();
                ArrayList<Teacher> teacherAL=new ArrayList<>();
                teacherAL.add(teacher);
                for (Teacher data:teacherAL)
                {
                    System.out.println(data.toString());
                }
        break;
            case 2:
                System.out.println("Enter student id");
                int studentid = sc.nextInt();
                System.out.println("Enter student name");
                String studentname = sc.next();
                System.out.println("Enter student age");
                int Studentage = sc.nextInt();
                System.out.println("Enter course");
                String course = sc.next();
                System.out.println("Enter marks");
                int marks = sc.nextInt();
        Student student=new Student();
        student.setId(studentid);
        student.setName(studentname);
        student.setAge(Studentage);
        student.setCourse(course);
        student.setMarks(marks);
        student.calculate(marks);
        ArrayList<Student> studentAL=new ArrayList<>();
        studentAL.add(student);
        for (Student data:studentAL)
        {
            System.out.println(data.toString());
        }
        break;
            default:
                System.out.println("Enter correct selection");

        }

}
        while (selection!=3);
        {
            sc.close();
        }

    }}
