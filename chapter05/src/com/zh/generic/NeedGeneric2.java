package com.zh.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 为什么需要泛型
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class NeedGeneric2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add("Java");
        for (Object o : list) {
            String str = (String) o;
            System.out.println(str);
        }

        list.add(123);
        list.add(1.23);
        int i = (Integer) list.get(2);
        double j = (Double) list.get(3);
        System.out.println(i);
        System.out.println(j);
    }
}
