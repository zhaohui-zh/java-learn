package com.zh.thread;

/**
 * @author Zhaohui
 * @date 2020/5/10
 */
public class MyThread04 {
    public static Integer count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (count < 10) {
                synchronized (count) {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (count < 20) {
                synchronized (count) {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        thread.join();
        thread2.start();

    }
}
