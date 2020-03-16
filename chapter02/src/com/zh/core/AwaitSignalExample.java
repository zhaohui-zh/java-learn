package com.zh.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * await,signal示例
 *
 * java.util.concurrent 类库中提供了 Condition 类来实现线程之间的协调，可以在 Condition
 * 上调用 await() 方法使线程等待，其它线程调用 signal() 或 signalAll() 方法唤醒等待的线程。
 * 相比于 wait() 这种等待方式，await() 可以指定等待的条件，因此更加灵活
 *
 * Created by zhaohui on 2020/3/16
 */
public class AwaitSignalExample {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void myAwait() {
        lock.lock();
        try {
            System.out.println("await start");
            condition.await();
            System.out.println("await end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void mySignal() {
        lock.lock();
        try {
            System.out.println("signal start");
            condition.signal();
            System.out.println("signal end");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AwaitSignalExample example = new AwaitSignalExample();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> example.myAwait());
        service.execute(() -> example.mySignal());
        service.shutdown();
    }
}
