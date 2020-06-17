package com.zh.generic;

/**
 * 泛型接口实现类-指定具体类型实现方式
 *
 * @author Zhaohui
 * @date 2020/5/26
 */
public class ImplGenericInterface2 implements GenericInterface<String> {

    @Override
    public String getData() {
        return "This is data";
    }
}
