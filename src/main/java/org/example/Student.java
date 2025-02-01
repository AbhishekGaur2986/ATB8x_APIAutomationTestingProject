package org.example;

public class Student
{

    private String name;
    private int rollno;
    private String marks;

    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
    public String getMarks(){
        return marks;
    }
    public void setName(String naam){
        this.name=naam;
    }
    public void setRollno(int no){
        this.rollno=no;
    }
    public void setMarks(String mark){
        this.marks =mark;
    }

//    public void display()
//    {
//        System.out.println(name);
//        System.out.println(rollno);
//        System.out.println(marks);
//
//    }
}
