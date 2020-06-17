package com.zh.test;

/**
 * Test01
 *
 * @author Zhaohui
 * @date 2020/5/16
 */
public class Test01 {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
    }
}
