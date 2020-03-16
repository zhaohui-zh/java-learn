package com.zh.core;

/**
 * 中断示例
 * Created by zhaohui on 2020/3/16
 */
public class InterruptExample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            // InterruptedException由sleep方法抛出
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.interrupt();
        System.out.println("Main run");
    }

}
