package com.zh.core;

/**
 * 继承Thread类来创建线程
 * Created by zhaohui on 2020/3/15
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

}
