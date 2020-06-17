package com.zh.test;

/**
 * MyTest
 *
 * @author Zhaohui
 * @date 2020/5/8
 */
public class MyTest {
    public static class Father {
        public int age;

        public Father() {
            this.age = 100;
        }

        public void print() {
            System.out.println("Father");
        }
    }

    public static class Son extends Father {
         public int age;

        public Son() {
            this.age = 10;
        }

        @Override
        public void print() {
            System.out.println("Son");
        }
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.age = 120;
        father.print();
        Father son = new Son();
        son.age = 12;
        son.print();
        Son son2 = new Son();
        son2.age = 12;
        son2.print();
    }
}
