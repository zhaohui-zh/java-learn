package com.zh.core;

/**
 * final测试类
 * final类不能被继承，没有子类
 * final类中的所有方法都隐式为final，因为无法覆盖他们，
 * 所以在final类中给任何方法添加final关键字是没有任何意义的。
 * Created by zhaohui on 2020/3/17
 */
public final class FinalTest01 {

    public void print() {
        System.out.println("This is Final Test01");
    }

}
