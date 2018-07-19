package com.base.other.demo.designpattern.strategy;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/11.
 * @Date 2018/7/11 15:20
 */
public abstract class Card implements PaymentMethod {

    private String name;
    private String number;
    //用来记录当前抽象类型的所有支付渠道
    public  static Map<String,Card> cardMap = new ConcurrentHashMap<String, Card>();


    @PostConstruct
    public void init(){
        cardMap.put(getType(),this);
    }

    public Card() {

    }

    public Card(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void pay(int cents) {
        execTransation(cents);
    }

    protected abstract String getType();//当前支付类型
    protected abstract void execTransation(int cents); //交易
}
