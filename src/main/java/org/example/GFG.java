package org.example;

public class GFG {

    static String emp_name;
    static float emp_salary;

    static void set(String n,float s){
        emp_name =n;
        emp_salary =s;
    }

    static void get(){
        System.out.println("Emp name is"+emp_name);
        System.out.println("Emp Salary is"+emp_salary);
    }

    public static void main(String[] args) {
        GFG.set("Pooja",32.6f);
        GFG.get();

    }
}
