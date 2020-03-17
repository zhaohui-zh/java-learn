package com.zh.core;

/**
 * volatile测试类
 * Created by zhaohui on 2020/3/17
 */
public class VolatileTest {
     public int a = 1;
     public int b = 2;

     public void change() {
         a = 3;
         b = a;
     }

     public void print() {
         System.out.println("a=" + a + ", b=" + b);
     }

    public static void main(String[] args) {
        VolatileTest test = new VolatileTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test.change();
            }
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test.print();
        }).start();
    }
}
