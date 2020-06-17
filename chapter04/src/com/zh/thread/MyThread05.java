package com.zh.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * MyThread05
 *
 * @author Zhaohui
 * @date 2020/5/11
 */
public class MyThread05 {
    private static final Lock lock = new ReentrantLock();

    private static Runnable runnable = () -> {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    };

    private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            Lock lock = new ReentrantLock();
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName());
            } finally {
                lock.unlock();
            }
        }
    };

    public static void main(String[] args) {
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread2.start();
    }
}
