package com.zh.interfase;

import java.util.Comparator;

/**
 * @author Zhaohui
 * @date 2020/5/27
 */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
