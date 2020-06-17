package com.zh.interfase;

import java.util.Arrays;

/**
 * @author Zhaohui
 * @date 2020/5/27
 */
public class MainTest{

    public static void main(String[] args) {
        String[] strings = {"Java", "CPP", "Apple"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
        Arrays.sort(strings, new LengthComparator());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
