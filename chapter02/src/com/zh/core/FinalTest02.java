package com.zh.core;

import java.util.Random;

/**
 * Final测试类
 * Created by zhaohui on 2020/3/17
 */
public class FinalTest02 {

    //编译期常量
    final int i = 1;
    final static int J = 1;
    final int[] a = {1,2,3,4};
    //非编译期常量
    // k的值由随机数对象决定，所以不是所有的final修饰的字段都是编译期常量，只是k的值在被初始化后无法被更改
    Random r = new Random();
    final int k = r.nextInt();

    public static void main(String[] args) {

    }
}
