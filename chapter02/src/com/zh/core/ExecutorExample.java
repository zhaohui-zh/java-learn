package com.zh.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 执行器（线程池）示例
 * 构建一个新的线程是有一定代价的， 因为涉及与操作系统的交互。如果程序中创建了大
 * 量的生命期很短的线程，应该使用线程池（thread pool）。一个线程池中包含许多准备运行的
 * 空闲线程。 将 Runnable 对象交给线程池， 就会有一个线程调用 run 方法。 当 run 方法退出
 * 时， 线程不会死亡，而是在池中准备为下一个请求提供服务。
 *
 * 执行器（Executor）类有许多静态工厂方法用来构建线程池
 *
 * Created by zhaohui on 2020/3/16
 */
public class ExecutorExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        // Lambda 创建线程，相当于创建了一个匿名内部线程
        executorService.execute(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // 中断所有线程
        // executorService.shutdownNow();
        System.out.println("Main run");

        Future<?> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // 中断一个线程
        future.cancel(true);
        System.out.println("Main run");
        // 等待所有线程任务执行完毕后，关闭线程池
        // 如果不关闭，即使所有线程任务执行完毕，线程池不会关闭，程序也不会终止
        executorService.shutdown();
    }

}
