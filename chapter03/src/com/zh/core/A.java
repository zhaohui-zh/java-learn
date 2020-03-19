package com.zh.core;

/**
 * Created by zhaohui on 2020/3/19
 */
public class A {

    private int id = 1;

    private void print() {
        System.out.println("print");
    }

    protected void printProtected() {
        System.out.println("Protected");
    }

    public static void main(String[] args) {
        A a = new A();
        a.print();
        System.out.println(a.id);
    }

}
