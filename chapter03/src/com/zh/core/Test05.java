package com.zh.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Test05
 *
 * @author Zhaohui
 * @date 2020/5/6
 */
public class Test05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("c++");
        list.add("java");
        list.add("python");
        list.add("c");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------");
        System.out.println(list.remove("c"));
        System.out.println("------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------");
        System.out.println(list.contains("c"));
        list.clear();
        System.out.println(list.size());
    }
}
