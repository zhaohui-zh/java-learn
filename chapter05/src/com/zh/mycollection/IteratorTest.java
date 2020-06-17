package com.zh.mycollection;

import java.util.*;

/**
 * @author Zhaohui
 * @date 2020/6/7
 */
public class IteratorTest {

    public static void test01(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        String[] strings = {"java", "cpp", "python"};
        for (String string : strings) System.out.println(string);
        List<String> list = new LinkedList<>();
        list.add("ss");
        Collections.addAll(list, strings);
        list.add(0, "Javascript");
        // System.out.println(list.getClass());
        for (String string : list) System.out.println(string);

        test01("java", "cpp", "python");
        List<String> list1 = new ArrayList<>();
    }
}
