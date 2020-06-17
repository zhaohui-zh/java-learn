package com.zh.core;

/**
 * Test03
 *
 * @author Zhaohui
 * @date 2020/5/3
 */
public class Test03 {
    public static void main(String[] args) {
        String str = new StringBuilder("计算机科学与技术").append("-软件工程").toString();
        System.out.println(str.intern() == str);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);

        String str3 ="hello" + "world";
        System.out.println(str3.intern() == str3);

        String str4 = "hahaha";
        System.out.println(str4.intern() == str4);
    }
}
