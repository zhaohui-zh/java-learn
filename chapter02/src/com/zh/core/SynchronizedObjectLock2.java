package com.zh.core;

/**
 * Synchronized锁示例2
 * Created by zhaohui on 2020/3/16
 */
public class SynchronizedObjectLock2 implements Runnable {

    Object object1 = new Object();
    Object object2 = new Object();

    @Override
    public void run() {
        synchronized (object1) {
            System.out.println("Block锁1: 我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Block锁1: " + Thread.currentThread().getName() + "结束");
        }
        synchronized (object2) {
            System.out.println("Block锁2: 我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Block锁2: " + Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        SynchronizedObjectLock2 myLock1 = new SynchronizedObjectLock2();
        Thread t1 = new Thread(myLock1);
        Thread t2 = new Thread(myLock1);
        t1.start();
        t2.start();
    }
}
