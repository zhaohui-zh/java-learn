package com.zh.myannotation;

import java.lang.annotation.*;

/**
 * @author Zhaohui
 * @date 2020/5/29
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    int id() default -1;
    String name() default "";
}
