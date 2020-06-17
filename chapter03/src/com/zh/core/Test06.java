package com.zh.core;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Test06
 *
 * @author Zhaohui
 * @date 2020/5/6
 */
public class Test06 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println(queue.size());
        queue.offer("c");
        queue.offer("c++");
        queue.offer("java");
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.element());
        queue.offer("python");
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println(queue.size());
        System.out.println(queue.contains("c++"));
    }
}
