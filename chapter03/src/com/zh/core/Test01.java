package com.zh.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Test01
 *
 * @author Zhaohui
 * @date 2020/4/14
 */
public class Test01 {
    public static void main(String[] args) {
        String string = "Zhaohui";
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
        char[] chars = string.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.size());
        list.remove(Integer.valueOf(1));
        System.out.println(list.size());

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println(map.size());
        System.out.println(map.get("key1"));
        map.remove("key1");
        System.out.println(map.size());
    }
}
