package com.zh.core;

/**
 * 方法锁
 * Created by zhaohui on 2020/3/16
 */
public class SynchronizedObjectLock3 implements Runnable {
    @Override
    public void run() {
        method();
    }

    public synchronized void method() {
        System.out.println("线程" + Thread.currentThread().getName() + "开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        SynchronizedObjectLock3 myLock = new SynchronizedObjectLock3();
        new Thread(myLock).start();
        new Thread(myLock).start();
    }
}
