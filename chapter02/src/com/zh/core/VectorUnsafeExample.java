package com.zh.core;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程相对安全示例
 * 相对线程安全需要保证对这个对象单独的操作是线程安全的，在调用的时候不需要做额外的保障措施。
 * 但是对于一些特定顺序的连续调用，就可能需要在调用端使用额外的同步手段来保证调用的正确性。
 * <p>
 * Vector中的很多方法都有同步关键字synchronized,从而保证所有的对外接口都会以 Vector对象为锁，
 * 即，在vector内部，所有的方法都不会被多线程访问。但是，单个方法的原子性（注：原子性，程序的
 * 原子性即不会被线程调度机制打断），并不能保证复合操作也具有原子性。
 * <p>
 * 即对于线程相对安全而言，对这个对象执行某一操作，或者说调用某一方法，可以保证它是安全的（即使
 * 多个线程同时调用此方法，也是安全的）。但是，当我们按照某些特定顺序连续调用此对象的不同方法，
 * 就未必是线程安全得了。下面给出的就是一个例子。
 * <p>
 * 注：Vector在Java里是线程（相对）安全的，Java中线程安全的类一般都是指线程相对安全。
 * <p>
 * Created by zhaohui on 2020/3/15
 */
public class VectorUnsafeExample {

    public static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < 100; i++) {
                vector.add(i);
            }
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(() -> {
                synchronized (vector) {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.remove(i);
                    }
                }
            });
            executorService.execute(() -> {
                synchronized (vector) {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.get(i);
                    }
                }
            });
            executorService.shutdown();
        }
    }

}
