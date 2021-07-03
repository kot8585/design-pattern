package com.example.design.singleton;

public class Printer_static {
    private static int counter = 0;

    public synchronized static void print(String str) { //이 메소드를 동기화 시키는구나
        counter++;
        System.out.println(str+counter);
    }
}
