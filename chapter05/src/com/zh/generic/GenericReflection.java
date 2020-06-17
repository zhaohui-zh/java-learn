package com.zh.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型反射
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class GenericReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        TypeVariable<? extends Class<?>>[] typeVariables = clazz.getTypeParameters();
        for (TypeVariable<? extends Class<?>> typeVariable : typeVariables) {
            System.out.println(typeVariable.getName());
        }

        List<String> list = new ArrayList<>();
        list.add("Java");
        // list.add(123); 无法编译通过
        Class<?> class2 = list.getClass();
        Method method = class2.getMethod("add", Object.class);
        method.invoke(list, 123);
        System.out.println(list);

        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();

        // System.out.println(arrayList1 instanceof ArrayList<String>);
        // arrayList1 == arrayList2;
    }
}
