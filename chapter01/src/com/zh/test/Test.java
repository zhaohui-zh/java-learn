package com.zh.test;

/**
 * 这是一个测试类
 * Created by zhaohui on 2020/2/25
 */
public class Test {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Integer x = 2;
//        int y = x;
//        System.out.println(y);
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);

        x = 127;
        y = 127;
        System.out.println(x == y);

        x = Integer.valueOf(121);
        y = Integer.valueOf(121);
        System.out.println(x == y);

        y = x.intValue();

        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1 == b2);

        b1 = new Boolean(true);
        b2 = new Boolean(true);
        System.out.println(b1 == b2);

        b1 = Boolean.valueOf(true);
        b2 = Boolean.valueOf(true);
        System.out.println(b1 == b2);

        boolean b3 = b1.booleanValue();

    }

}
