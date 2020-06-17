package com.zh.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhaohui
 * @date 2020/5/26
 */
public class ErasedClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        ErasedClass<String> erasedClass = new ErasedClass<>();
        System.out.println(erasedClass.toString());

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Cpp");

        
    }

}
