package com.zh.thread;

/**
 * MyThread01
 *
 * @author Zhaohui
 * @date 2020/5/10
 */
public class MyThread01 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread01 thread = new MyThread01();
        thread.start();
        thread.run();
    }
}
