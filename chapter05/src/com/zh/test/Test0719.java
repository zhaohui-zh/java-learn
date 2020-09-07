package com.zh.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhaohui
 * @date 2020/7/19
 */
public class Test0719 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
