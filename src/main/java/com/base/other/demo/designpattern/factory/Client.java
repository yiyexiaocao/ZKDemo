package com.base.other.demo.designpattern.factory;

/**
 * @DESC 用于创建复制对象，明确地计划不同条件下创建不同的实例。
 *       优点：使代码结构清晰，能够更加有效的进行封装。对调用者屏蔽具体的产品实现。降低耦合度。
 *       缺点：单对象，使用工厂模式会增加其系统的复杂度
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:10
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}
