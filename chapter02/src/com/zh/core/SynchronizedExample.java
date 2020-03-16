package com.zh.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Synchronized示例
 * 普通同步方法（实例方法），锁是当前实例对象 ，进入同步代码前要获得当前实例的锁
 * 静态同步方法，锁是当前类的class对象 ，进入同步代码前要获得当前类对象的锁
 * 同步方法块，锁是括号里面的对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁
 * Created by zhaohui on 2020/3/16
 */
public class SynchronizedExample {

    public synchronized void fun() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SynchronizedExample example1 = new SynchronizedExample();
        SynchronizedExample example2 = new SynchronizedExample();

        ExecutorService service = Executors.newCachedThreadPool();
        // 同一个对象的普通同步方法，两个线程会进行同步，当一个线程进入同步语句块时，另一个线程就必须等待
        service.execute(() -> example1.fun());
        service.execute(() -> example1.fun());
        // 两个线程调用了不同对象的同步代码块，因此这两个线程就不需要同步。从输出结果可以看出，两个线程交叉执行。
        // service.execute(() -> example1.fun());
        // service.execute(() -> example1.fun());
        service.shutdown();
    }

}
