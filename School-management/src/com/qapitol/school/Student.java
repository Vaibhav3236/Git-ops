package com.qapitol.school;

public class Student extends Person
{
    private String course;
    private int marks;

    public void calculate(int marks)
    {
        if(marks>70){
            System.out.println("A");}
       else if(marks>=50){
            System.out.println("B");}
        else {
            System.out.println("C");}
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
@Override
public void displayData(){
    System.out.println("Id="+getId()+" Name="+getName()+" Age="+getAge()+
            " Course="+getCourse()+" Marks="+getMarks());
}

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", marks=" + marks +"id="+getId()+"NAme="+'}';
    }
}
