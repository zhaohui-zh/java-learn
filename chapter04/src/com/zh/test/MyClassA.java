package com.zh.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhaohui
 * @date 2020/5/25
 */
public class MyClassA<T> {
    String msg;
    T data;

    public MyClassA(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <T> MyClassA<T> factoryMethod(String msg, T data) {
        return new MyClassA<>(msg, data);
    }

    public static void main(String[] args) {
        String data = "This is data";
        String msg = "This is msg";
        MyClassA<String> myClassA = MyClassA.<String>factoryMethod(msg, data);

        List list = new ArrayList();
        String iter = "abc";
        list.add(iter);
        list.add(123);
        String iter2 = (String) list.get(0);
        System.out.println(list.get(0).getClass());
        System.out.println(list.get(1).getClass());
    }
}
