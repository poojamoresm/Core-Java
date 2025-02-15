package org.example.encapsulation;

public class Geeks {
    public static void main(String[] args) {
        Employee employee= new Employee();

        employee.setEmp_id(1);
        employee.setEmp_name("Pooja");

        System.out.println(employee.getEmp_id());

        System.out.println(employee.getEmp_name());
    }
}
