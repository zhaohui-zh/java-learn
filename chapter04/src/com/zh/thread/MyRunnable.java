package com.zh.thread;

/**
 * MyRunnable
 *
 * @author Zhaohui
 * @date 2020/5/10
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
