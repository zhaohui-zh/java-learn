package com.zh.polymorphism;

/**
 * Rectangle
 * Created by zhaohui on 2020/3/26
 */
public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle's draw");
    }

    public static void staticDraw() {
        System.out.println("Rectangle's static draw");
    }

}
