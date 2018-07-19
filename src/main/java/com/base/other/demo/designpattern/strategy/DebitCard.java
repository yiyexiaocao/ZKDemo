package com.base.other.demo.designpattern.strategy;

import org.springframework.stereotype.Service;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/11.
 * @Date 2018/7/11 15:24
 */
@Service
public class DebitCard extends Card {

    protected String getType() {
        return Constants.DEBIT_CARD;
    }

    protected void execTransation(int cents) {
        System.out.println("贷记卡支付："+cents+"元");
    }
}
