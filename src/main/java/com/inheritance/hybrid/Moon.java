package com.inheritance.hybrid;

public class Moon extends Earth {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

      System.out.println(ss instanceof  SolarSystem);
        System.out.println(e instanceof  Earth);
        System.out.println(m instanceof  Mars);
    }
}
