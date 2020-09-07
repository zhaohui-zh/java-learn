package com.zh.test;

import java.lang.reflect.Method;

/**
 * @author Zhaohui
 * @date 2020/9/1
 */
public class Test09011 {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() );
        }
    }
}
