package com.zh.core;

/**
 * 线程测试类01
 * Created by zhaohui on 2020/3/16
 */
public class ThreadTest01 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello");
            // 声明了当前线程已经完成了生命周期中最重要的部分，可以切换给其它线程来执行。
            // 该方法只是对线程调度器的一个建议，而且也只是建议具有相同优先级的其它线程可以运行
            Thread.yield();
        };
        Thread thread = new Thread(runnable);
        // 设置为守护进程
        // thread.setDaemon(true);
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("world"));
        thread1.start();

    }

}
