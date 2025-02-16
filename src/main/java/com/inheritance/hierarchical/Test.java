package com.inheritance.hierarchical;

public class Test {
    public static void main(String[] args) {
        ChildThree ct = new ChildThree();
        ct.printParent();
        ct.printChildThree();

        ChildTwo cc = new ChildTwo();
        cc.ChildTwo();
        cc.printParent();

        ChildOne childOne = new ChildOne();
        childOne.printB();
        childOne.printParent();

        Parent parent= new Parent();
        parent.printParent();
    }
}
