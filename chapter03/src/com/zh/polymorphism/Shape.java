package com.zh.polymorphism;

/**
 * Shape
 * Created by zhaohui on 2020/3/26
 */
public class Shape {

    public void draw() {
        System.out.println("Shape's draw");
    }

    public static void staticDraw() {
        System.out.println("Shape's static draw");
    }

    public static final void staticFinaleDraw() {
        System.out.println("Shape's static final draw");
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Circle();

        shape1.draw();
        shape2.draw();
        shape3.draw();

        shape1.staticDraw();
        shape2.staticDraw();
        shape3.staticDraw();
    }
}
