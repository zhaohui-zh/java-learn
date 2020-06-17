package com.zh.generic;

/**
 * 泛型类
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class GenericClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setData("Java");
        String str = genericClass.getData();
        System.out.println(str);
    }
}
