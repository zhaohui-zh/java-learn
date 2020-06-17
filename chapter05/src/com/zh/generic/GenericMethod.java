package com.zh.generic;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * 泛型方法
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class GenericMethod {
    public <T> void print(T t){
        System.out.println(t.toString());
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.<Double>print(123.);
        genericMethod.print(123.);
        genericMethod.<String>print("Java");
        genericMethod.print("Java");
    }
}
