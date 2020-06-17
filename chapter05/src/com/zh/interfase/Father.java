package com.zh.interfase;

/**
 * @author Zhaohui
 * @date 2020/5/27
 */
public interface Father {
    default void print() {
        System.out.println("This is father");
    }
}
