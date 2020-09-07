package com.zh.test;

import java.io.File;

/**
 * @author Zhaohui
 * @date 2020/9/7
 */
public class Test09061 {
    public static void main(String[] args) {
        File file = new File("C:/");
        System.out.println(file.exists());
        System.out.println(System.getProperty("user.home"));
        System.out.println(new File("C:/Users/Zhaohui").exists());
    }
}
