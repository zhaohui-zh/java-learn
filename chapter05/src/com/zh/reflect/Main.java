package com.zh.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Zhaohui
 * @date 2020/9/12
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class clazz = Fruit.class;
        Field[] fields = clazz.getFields();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.print(field.getName() + " ");
        }
        System.out.println();
        for (Field field : declaredFields) {
            System.out.print(field.getName() + " ");
        }
        System.out.println();
        Method[] methods = clazz.getMethods();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName() + " ");
        }
        System.out.println();
        for (Method method : declaredMethods) {
            System.out.print(method.getName() + " ");
        }
        System.out.println();
        Fruit fruit = (Fruit) clazz.newInstance();

        Method myMethod = clazz.getMethod("setName", String.class);
        Method myMethod2 = clazz.getMethod("getName");
        Object object = myMethod.invoke(fruit, "apple");
        for (Field field : declaredFields) {
            System.out.println("---");
            System.out.println(field.getName());
            field.setAccessible(true);
            System.out.println(field.get(fruit));
            field.set(fruit, "banana");
            System.out.println("---");
        }
        System.out.println((String) myMethod2.invoke(fruit));
    }
}
