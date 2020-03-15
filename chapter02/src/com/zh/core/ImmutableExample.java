package com.zh.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 不可变对象示例
 * 不可变对象一定是线程安全的
 * Created by zhaohui on 2020/3/15
 */
public class ImmutableExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 通过Collections.unmodifiableXXX() 方法来获取一个不可变的集合
        Map<String, Integer> unmodidfiableMap = Collections.unmodifiableMap(map);
        map.put("Hello", 1);
        // unmodidfiableMap.put("World", 2);
        // 此句会报错 Exception in thread "main" java.lang.UnsupportedOperationException
    }

}
