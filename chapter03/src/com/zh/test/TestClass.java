package com.zh.test;

/**
 * TestClass
 *
 * @author Zhaohui
 * @date 2020/5/6
 */
public class TestClass {
    private int m;

    public TestClass(int m) {
        this.m = m;
    }

    public int inc() {
        return m + 1;
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass(3);
        testClass.inc();
    }
}
