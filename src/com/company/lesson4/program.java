package com.company.lesson4;

import java.util.Scanner;

public class program {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.join();
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread from main =>" + i);
            if(i==50)myThread.interrupt();
        }

    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(isInterrupted())break;
            System.out.println("Thread from MyTread........ " + i);
        }
    }
}