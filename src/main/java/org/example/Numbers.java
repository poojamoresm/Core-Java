package org.example;

public class Numbers {
    private  int a;
    private int b;

    public void sum(){
        System.out.println(a+b);

    }

    public void sub(){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.a=10;
        num.b=20;

        num.sub();
        num.sum();
    }
}
