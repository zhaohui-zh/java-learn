package com.zh.core;

/**
 * Test04
 * @author Zhaohui
 * @date 2020/5/4
 */
public class Test04 {
    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = new String("Hello Java");
        String str3 = str2.intern();
        String str4 = new StringBuilder("Hello").append(" Java").toString();
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4.intern());
        int[] arr = {1, 3, 4};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
