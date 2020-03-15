package com.zh.core;

/**
 * 通过实现Runnable接口来创建线程
 * Created by zhaohui on 2020/3/15
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // 将MyRunnable的实例传给Thread的构造器，创建Thread
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        // Runnable是函数式接口，可以使用lambda表达式建立其实例
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread.start();
        thread1.start();
    }
}
