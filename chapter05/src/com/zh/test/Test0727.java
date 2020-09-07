package com.zh.test;

import java.math.BigInteger;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Zhaohui
 * @date 2020/7/25
 */
public class Test0727 {
    public static void main(String[] args) {
        // BigInteger bigInteger1 = new BigInteger("12345678");
        // BigInteger bigInteger2 = BigInteger.valueOf(12345);
        // BigInteger result = bigInteger1.multiply(bigInteger2);
        // System.out.println(bigInteger1);
        // System.out.println(bigInteger2);
        // System.out.println(result);

        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Deque<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
