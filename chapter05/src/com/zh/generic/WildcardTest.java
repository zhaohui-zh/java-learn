package com.zh.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符测试
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class WildcardTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // list1 = list2;

        List<?> list3 = list1;
        list3 = list2;
    }
}
