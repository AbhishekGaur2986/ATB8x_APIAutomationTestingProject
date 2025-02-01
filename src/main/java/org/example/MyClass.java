package org.example;

import java.sql.SQLOutput;

public class MyClass {

    public static void main(String[] args) {

        Student str = new Student();

        str.setName("Abhishek");
        str.setRollno(1001);
        str.setMarks("98,78,76");

        System.out.println(str.getName());

//        str.getName();
//        str.getRollno();
        //str.display();
    }
}
