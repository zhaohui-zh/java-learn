package com.zh.myannotation;

import java.lang.reflect.Field;

/**
 * @author Zhaohui
 * @date 2020/5/29
 */
public class Apple {
    @FruitProvider(id = 1, name = "Red Apple")
    private String appleProvider;

    public static void main(String[] args) {
        Class<?> clazz = Apple.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider =  field.getAnnotation(FruitProvider.class);
                System.out.println(fruitProvider.id());
                System.out.println(fruitProvider.name());
            }
        }
        System.out.println(System.getProperty("user.dir"));
    }
}
