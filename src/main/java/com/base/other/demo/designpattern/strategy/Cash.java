package com.base.other.demo.designpattern.strategy;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/11.
 * @Date 2018/7/11 15:20
 */
public class Cash implements PaymentMethod {
    public void pay(int cents) {
        System.out.println("使用现金支付："+cents+"元");
    }
}
