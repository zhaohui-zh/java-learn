package com.zh.core;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 条件锁示例
 * 条件锁，是指在获取锁之后发现当前业务场景自己无法处理，而需要等待某个条件的出现
 * 才可以继续处理时使用的一种锁
 * 注意，这里的条件，必须是在获取锁之后去等待，对应到ReentrantLock的条件锁，
 * 就是获取锁之后才能调用condition.await()方法
 * Created by zhaohui on 2020/3/16
 */
public class ConditionLockExample {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Before await");
                condition.await();
                System.out.println("After await");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();

        // 睡眠1000ms让上面的线程先获得锁
        Thread.sleep(1000);

        new Thread(() -> {
            lock.lock();
            try {
                Thread.sleep(2000); //业务执行时间
                System.out.println("Signal await");
                condition.signal();
                System.out.println("Signal await");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();

    }

}
