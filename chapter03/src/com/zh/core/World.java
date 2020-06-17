package com.zh.core;

import java.util.Arrays;
import java.util.List;

/**
 * World类
 *
 * @author Zhaohui
 * @date 2020/3/29
 */
public class World {
    public static void main(String[] args) {
        System.out.println("World");
        Integer[] arr = {1, 5, 3, 10, 2};
        List<Integer> list = Arrays.asList(arr);
        list.sort(null);
        Arrays.sort(arr);
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        for (Integer integer : list)
            System.out.print(integer + " ");
        System.out.println();

    }
}
