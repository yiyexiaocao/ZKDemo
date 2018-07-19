package com.base.other.demo.designpattern.factory;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:09
 */
public class Factory implements IFactory {


    public IProduct createProduct() {
        return new Product();
    }
}
