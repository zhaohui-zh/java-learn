package com.zh.core;

/**
 * SynchronizedDemo
 * Created by zhaohui on 2020/3/16
 */
public class SynchronizedDemo {
    Object object = new Object();

    public void method() {
        synchronized (object) {

        }
    }
}
