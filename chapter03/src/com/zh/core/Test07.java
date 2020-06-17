package com.zh.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Test07
 *
 * @author Zhaohui
 * @date 2020/5/6
 */
public class Test07 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map.size());
        for (Integer integer : map.keySet()) {
            System.out.println(integer);
        }
        for (String value : map.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue());
        }
        map.remove(1);
        System.out.println(map.size());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("three"));
        System.out.println(map.containsValue("one"));
    }
}
