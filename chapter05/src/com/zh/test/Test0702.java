package com.zh.test;

import java.util.Arrays;

/**
 * @author Zhaohui
 * @date 2020/7/2
 */
public class Test0702 {

    public static long factorial(long n) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr, 1);
    }
}
