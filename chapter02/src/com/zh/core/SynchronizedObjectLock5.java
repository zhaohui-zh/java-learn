package com.zh.core;

/**
 * Synchronized修饰静态方法
 * 默认的锁是当前类的Class对象
 * Created by zhaohui on 2020/3/16
 */
public class SynchronizedObjectLock5 implements Runnable {


    @Override
    public void run() {
        method();
    }

    public static synchronized void method() {
        System.out.println("线程" + Thread.currentThread().getName() + "开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        SynchronizedObjectLock5 myLock1 = new SynchronizedObjectLock5();
        SynchronizedObjectLock5 myLock2 = new SynchronizedObjectLock5();
        // 两个线程需要的是同一把锁
        new Thread(myLock1).start();
        new Thread(myLock2).start();
    }
}
