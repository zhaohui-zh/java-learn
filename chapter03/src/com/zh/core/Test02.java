package com.zh.core;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Test02
 *
 * @author Zhaohui
 * @date 2020/4/14
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[10];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        for (int i : arr2) {
            System.out.println(i);
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
