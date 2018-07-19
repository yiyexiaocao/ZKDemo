package com.base.run;

import com.base.other.demo.designpattern.strategy.Card;
import com.base.other.demo.designpattern.strategy.Constants;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/11.
 * @Date 2018/7/11 15:40
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        Card.cardMap.get(Constants.CREDT_CARD).pay(1000);
    }
}
