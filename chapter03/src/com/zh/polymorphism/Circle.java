package com.zh.polymorphism;

/**
 * Circle
 * Created by zhaohui on 2020/3/26
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle's draw");
    }
    public static void staticDraw() {
        System.out.println("Circle's static draw");
    }
}
