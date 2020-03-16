package com.zh.core;

/**
 * Synchronized锁示例1
 * Created by zhaohui on 2020/3/16
 */
public class SynchronizedObjectLock1 implements Runnable {

    public static SynchronizedObjectLock1 instance = new SynchronizedObjectLock1();

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
    }
}
