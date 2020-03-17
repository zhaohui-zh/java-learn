package com.zh.core;

/**
 * 单例模式示例
 * Created by zhaohui on 2020/3/17
 */
public class Singleton {

    public static volatile Singleton singleton;

    /**
     * 私有构造函数，禁止外部实例化
     */
    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (singleton) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
