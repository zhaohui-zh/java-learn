package com.zh.test;

import java.util.Arrays;
import java.util.List;

/**
 * TestClass02
 *
 * @author Zhaohui
 * @date 2020/5/7
 */
public class TestClass02 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        List<Integer> list = Arrays.asList(a);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
