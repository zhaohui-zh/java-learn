package com.zh.core;

/**
 * Synchronized锁定Class对象
 * Created by zhaohui on 2020/3/16
 */
public class SynchronizedObjectLock6 implements Runnable {
    @Override
    public void run() {
        // 所有线程需要同一把锁
        synchronized (SynchronizedObjectLock6.class) {
            System.out.println("线程" + Thread.currentThread().getName() + "开始");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        SynchronizedObjectLock6 myLock1 = new SynchronizedObjectLock6();
        SynchronizedObjectLock6 myLock2 = new SynchronizedObjectLock6();
        // 两个线程需要的是同一把锁
        new Thread(myLock1).start();
        new Thread(myLock2).start();
    }
}
