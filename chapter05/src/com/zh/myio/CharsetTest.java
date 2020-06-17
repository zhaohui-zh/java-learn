package com.zh.myio;

import java.util.Scanner;

/**
 * @author Zhaohui
 * @date 2020/5/29
 */
public class CharsetTest {
    public static void main(String[] args) {
        String str = "\u21E6hello";
        System.out.println(str.codePointAt(0));
        System.out.println("\u24C7");
        char c = '哈';
        System.out.println(c);

        str = "接口可";
        System.out.println(str.length());
        System.out.println(str.codePointAt(0));
        System.out.println(str.charAt(0));

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextInt());
    }
}
