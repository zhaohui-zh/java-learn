package com.zh.test;

/**
 * TestClass03
 *
 * @author Zhaohui
 * @date 2020/5/9
 */
public class TestClass03 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        TestClass03 testClass03 = new TestClass03();
        testClass03.setName("Aleph-null");

        Thread thread = new Thread();
        
    }
}
