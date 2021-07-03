package com.example.design.singleton;


public class Printer1 {
    private static Printer1 printer1 = new Printer1();
    private int counter = 0;

    public static Printer1 printer1() {
        return printer1;
    }

    public void print(String str) {
        counter++;
        System.out.println(str);
    }
}
