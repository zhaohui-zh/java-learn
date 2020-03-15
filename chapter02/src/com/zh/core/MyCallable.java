package com.zh.core;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 通过MyCallable接口创建线程
 * Callable与Runnable类似，都封装了一个异步任务，但Callable可以有返回值
 * Future保存的是异步计算(Callable)的结果，使用其实例的get方法可以得到返回值
 *
 * FutureTask包装器是一种非常便利的机制，可将 Callable转换成Future和Runnable,
 * 它同时实现二者的接口
 *
 * Created by zhaohui on 2020/3/16
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 123;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> task = new FutureTask<>(myCallable);
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(task.get());
    }
}
