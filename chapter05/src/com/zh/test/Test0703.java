package com.zh.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhaohui
 * @date 2020/7/3
 */
public class Test0703 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int i = list.size() - 1; i >= 0; i--) System.out.println(list.get(i));
        System.out.println(list.size());
        int a = 10;

    }
}
