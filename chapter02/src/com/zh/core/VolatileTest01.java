package com.zh.core;

/**
 * volatile测试类
 * Created by zhaohui on 2020/3/17
 */
public class VolatileTest01 {

    volatile int i = 0;

    public void add() {
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        final VolatileTest01 test01 = new VolatileTest01();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test01.add();
            }).start();
        }
        Thread.sleep(10000);
        System.out.println(test01.i);
    }

}
