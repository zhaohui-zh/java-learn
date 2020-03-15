package com.zh.core;

/**
 * 线程中断示例2
 * Created by zhaohui on 2020/3/16
 */
public class InterruptExample2 extends Thread {

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println(1);
        }
        System.out.println("Thread end");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new InterruptExample2();
        thread.start();
        Thread.sleep(1);
        thread.interrupt();
    }

}
