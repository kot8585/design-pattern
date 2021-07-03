package com.example.design.singleton;

/**
 * getPrinter를 동기화시켜 싱글턴 패턴 유지하기
 */
public class Printer_sync {
    private static Printer_sync printer_sync = null;
    private int counter = 0;
    private Printer_sync() {} //얘를 막아줘야된다.!!

    public static synchronized Printer_sync getPrinter() {
        if (printer_sync == null) {
            printer_sync = new Printer_sync();
        }
        return printer_sync;
    }

    public void print(String str) {
        synchronized (this) { //오직 하나의 스레드만 접근을 허용함
            counter++;
            System.out.println(str+counter);
        }
    }
}
