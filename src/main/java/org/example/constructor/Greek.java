package org.example.constructor;

public class Greek {
    String name;
    int id;

    Greek(String n,int i){
        this.name=n;
        this.id=i;
    }

    public static void main(String[] args) {
        Greek greek=new Greek("Pooja",1);

        System.out.println("greek is name "+greek.name +" greek id is "+greek.id);
    }
}
