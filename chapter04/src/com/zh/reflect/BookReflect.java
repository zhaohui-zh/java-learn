package com.zh.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * BookReflect
 *
 * @author Zhaohui
 * @date 2020/5/16
 */
public class BookReflect {
    private static final String TAG = "BookReflect";

    // 创建对象
    public static void reflectNewInstance() {
        try {
            Class<?> classBook = Class.forName("com.zh.reflect.Book");
            Object objectBook = classBook.newInstance();
            Book book = (Book) objectBook;
            book.setName("创建对象");
            book.setAuthor("创建对象");
            System.out.println(TAG + ": reflectNewInstance -> book = " + book.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 反射无参构造方法
    public static void reflectDefaultConstructor() {
        try {
            Class<?> classBook = Class.forName("com.zh.reflect.Book");
            Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor(null);
            declaredConstructorBook.setAccessible(true);
            Object objectBook = declaredConstructorBook.newInstance();
            Book book = (Book) objectBook;
            book.setName("反射无参构造方法");
            book.setAuthor("反射无参构造方法");
            System.out.println(TAG + ": reflectPrivateConstructor -> book = " + book.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 反射私有的构造方法
    public static void reflectPrivateConstructor() {
        try {
            Class<?> classBook = Class.forName("com.zh.reflect.Book");
            Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor(String.class, String.class);
            declaredConstructorBook.setAccessible(true);
            Object objectBook = declaredConstructorBook.newInstance("反射私有的构造方法","反射私有的构造方法");
            Book book = (Book) objectBook;
            System.out.println(TAG + ": reflectPrivateConstructor -> book = " + book.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 反射私有属性
    public static void reflectPrivateField() {
        try {
            Class<?> classBook = Class.forName("com.zh.reflect.Book");
            Object objectBook = classBook.newInstance();
            Field fieldTag = classBook.getDeclaredField("TAG");
            fieldTag.setAccessible(true);
            String tag = (String) fieldTag.get(objectBook);
            System.out.println(TAG + ": reflectPrivateField -> tag = " + tag);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 反射私有方法
    public static void reflectPrivateMethod() {
        try {
            Class<?> classBook = Class.forName("com.zh.reflect.Book");
            Method methodBook = classBook.getDeclaredMethod("declaredMethod", int.class);
            methodBook.setAccessible(true);
            Object objectBook = classBook.newInstance();
            String string = (String) methodBook.invoke(objectBook,0);
            System.out.println(TAG + ": reflectPrivateMethod -> string = " + string);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        reflectNewInstance();
        reflectDefaultConstructor();
        reflectPrivateConstructor();
        reflectPrivateField();
        reflectPrivateMethod();
    }
}
