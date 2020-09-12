package com.zh.proxy;

import com.zh.proxy.impl.HelloServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author Zhaohui
 * @date 2020/9/11
 */
public class Main {
    public static void main(String[] args) {
        HelloService target = new HelloServiceImpl();
        HelloHandler helloHandler = new HelloHandler(target);
        HelloService proxy = (HelloService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), helloHandler);
        target.hello();
        proxy.hello();
    }
}
