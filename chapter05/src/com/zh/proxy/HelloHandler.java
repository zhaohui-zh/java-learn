package com.zh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Zhaohui
 * @date 2020/9/11
 */
public class HelloHandler implements InvocationHandler {
    private Object target;
    public HelloHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "start run");
        Object object = method.invoke(target, args);
        System.out.println(method.getName() + "stop run");
        return object;
    }
}
