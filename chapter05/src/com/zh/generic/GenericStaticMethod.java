package com.zh.generic;

/**
 * 泛型静态方法
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class GenericStaticMethod {
    public static <T> void print(T t){
        System.out.println(t.toString());
    }

    public static void main(String[] args) {
        GenericStaticMethod.<Double>print(123.);
        GenericStaticMethod.print(123.);
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.<String>print("Java");
        genericMethod.print("Java");
    }
}
