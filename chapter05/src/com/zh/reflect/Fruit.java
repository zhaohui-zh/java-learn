package com.zh.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Zhaohui
 * @date 2020/9/12
 */
public class Fruit {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void myPrivate() {
        System.out.println("This ia a private method");
    }


}
