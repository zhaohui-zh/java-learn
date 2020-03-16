package com.zh.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock（重入锁）示例
 * Created by zhaohui on 2020/3/16
 */
public class ReentrantLockExample {

    private ReentrantLock lock = new ReentrantLock();

    public void fun() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        } finally {
            lock.unlock(); //确保锁释放，从而避免发生死锁
        }
    }

    public static void main(String[] args) {

        ReentrantLockExample example = new ReentrantLockExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> example.fun());
        executorService.execute(() -> example.fun());
        executorService.shutdown();

    }

}
