package org.example;

public class Student {

    int id;
    String stud_name;

    public void printStudInfo(){
        System.out.println("Id is "+id);
        System.out.println("Name is "+stud_name);
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.id =1;
        student.stud_name="Pooja";

        student.printStudInfo();
    }
}
