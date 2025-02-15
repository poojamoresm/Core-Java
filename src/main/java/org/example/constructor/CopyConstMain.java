package org.example.constructor;

public class CopyConstMain {
    public static void main(String[] args) {
        CopyConstrutorDemo demo = new CopyConstrutorDemo("Pooja",2);

        System.out.println("Parameterized construtor"+demo.id +" "+demo.name);

        CopyConstrutorDemo demo1 = new CopyConstrutorDemo(demo);

        System.out.println("Copy construtor "+ demo1.id +" "+demo1.name);
    }
}
