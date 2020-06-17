package com.zh.thread;

/**
 * @author Zhaohui
 * @date 2020/5/10
 */
public class MyThread02 {
    public static void main(String[] args) {
        Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName());
                    }
                }
        );
        thread.start();
    }
}
