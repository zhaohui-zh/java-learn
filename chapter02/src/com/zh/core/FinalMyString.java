package com.zh.core;

/**
 * 使用组合关系服用String类中的所有方法
 * 设计模式中最重要的两种关系，一种是继承/实现；另外一种是组合关系。
 * 所以当遇到不能用继承的(final修饰的类),应该考虑用组合, 如下代码大概写个组合实现的意思
 * Created by zhaohui on 2020/3/17
 */
public class FinalMyString {

    private String innerString;

    // 支持老的方法
    public int length() {
        return innerString.length();
    }

    // 添加新的方法
    public void toMyString() {
        // do something
    }

}
