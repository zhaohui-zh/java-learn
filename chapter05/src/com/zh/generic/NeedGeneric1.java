package com.zh.generic;

/**
 * 为什么需要泛型
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class NeedGeneric1 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}
