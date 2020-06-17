package com.zh.interfase;

/**
 * 内部类示例
 *
 * @author Zhaohui
 * @date 2020/5/27
 */
public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    // 隐式传递this
    public Inner getInner() {
        return new Inner();
    }

    // 显式传递this
    public Inner getInner2() {
        return this.new Inner();
    }

    public class Inner {
        // 使用隐式外部类引用
        public void innerPrint() {
            System.out.println("This ia inner class, outer name is " + name);
        }

        // 显式使用外部类引用
        public void innerPrint2() {
            System.out.println("This ia inner class, outer name is " + Outer.this.name);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer("Java");
        Inner inner = outer.getInner();
        inner.innerPrint();
        inner.innerPrint2();

        Outer outer1 = new Outer("Cpp");
        Inner inner1 = outer1.getInner2();
        inner1.innerPrint();
        inner1.innerPrint2();

        // 显式设置外部类引用
        Outer outer2 = new Outer("Python");
        Inner inner2 = outer2.new Inner();
        inner2.innerPrint();
        inner2.innerPrint2();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am running");
            }
        };

    }
}
