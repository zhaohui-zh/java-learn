package com.zh.generic;

/**
 * 泛型类的泛型静态方法
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class GenericClassGenericStaticMethod<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> void printT(T t) {
        System.out.println(t.toString());
    }

    public static <U> void printU(U u) {
        System.out.println(u.toString());
    }

    public static void main(String[] args) {
        GenericClassGenericStaticMethod<String> staticMethod = new GenericClassGenericStaticMethod<>();

        staticMethod.setData("Hello");
        String str = staticMethod.getData();
        System.out.println(str);

        staticMethod.printT("Java");
        staticMethod.printT(123);

        staticMethod.printU("Java");
        staticMethod.printU(123);

        GenericClassGenericStaticMethod.printT("Java");
        GenericClassGenericStaticMethod.printT(123);

        GenericClassGenericStaticMethod.printU("Java");
        GenericClassGenericStaticMethod.printU(123);

    }
}
