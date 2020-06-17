package com.zh.interfase;

/**
 * 静态内部类
 *
 * @author Zhaohui
 * @date 2020/5/28
 */
public class StaticInner {

    private static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Point point = new Point(1.2, 3.4);
    }
}
