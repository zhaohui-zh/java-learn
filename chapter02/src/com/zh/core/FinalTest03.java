package com.zh.core;

import java.util.Random;

/**
 * Final测试类
 * Created by zhaohui on 2020/3/17
 */
public class FinalTest03 {

    static Random random = new Random();
    final int i = random.nextInt();
    static final int j = random.nextInt();

    public static void main(String[] args) {
        FinalTest03 test1 = new FinalTest03();
        FinalTest03 test2 = new FinalTest03();

        System.out.println(test1.i + "\t" + test1.j);
        System.out.println(test2.i + "\t" + test2.j);
    }

}
