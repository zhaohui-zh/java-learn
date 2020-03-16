package com.zh.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * wait,notify示例
 *
 * 调用 wait() 使得线程等待某个条件满足，线程在等待时会被挂起，当其他线程的运行使得这个条件满足时，
 * 其它线程会调用 notify() 或者 notifyAll() 来唤醒挂起的线程。
 * 它们都属于 Object 的一部分，而不属于 Thread
 *
 * Created by zhaohui on 2020/3/16
 */
public class WaitNotifyExample {

    public synchronized void myWait() {
        try {
            wait();
            System.out.println("Wait end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void myNoyify() {
        notify();
        System.out.println("notifyEnd");
    }

    public static void main(String[] args) {
        WaitNotifyExample example = new WaitNotifyExample();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> example.myWait());
        service.execute(() -> example.myNoyify());
        service.shutdown();
    }

}
