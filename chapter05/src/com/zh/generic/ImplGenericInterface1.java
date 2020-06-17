package com.zh.generic;

/**
 * 泛型接口实现类-泛型类实现方式
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class ImplGenericInterface1<T> implements GenericInterface<T> {
    private T data;

    @Override
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
