package com.qapitol.school;

public class Teacher extends Person
{
    private String subTeacher;
    private double salary;

    public String getSubTeacher() {
        return subTeacher;
    }
    public void setSubTeacher(String subTeacher) {
        this.subTeacher = subTeacher;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayData()
    {
        System.out.println("ID="+getId()+" " +"Name="+ getName()+" "+"AGE= "+ getAge()+" "+
                "SubjectTeacher::"+getSubTeacher()+" "+" Salary::"+ getSalary());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subTeacher='" + subTeacher + '\'' +
                ", salary=" + salary +
                '}';
    }
}
