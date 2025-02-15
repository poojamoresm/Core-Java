package org.example.constructor;

public class CopyConstrutorDemo {

    String  name;
    int id;

    CopyConstrutorDemo(String n,int i){
        this.id = i;
        this.name = n;
    }

    CopyConstrutorDemo(CopyConstrutorDemo cc){
        this.id = cc.id;
        this.name = cc.name;
    }

}
