package com.company;

public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());

        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


