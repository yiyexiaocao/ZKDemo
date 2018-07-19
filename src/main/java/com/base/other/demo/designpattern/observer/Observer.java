package com.base.other.demo.designpattern.observer;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:36
 */
public abstract class Observer {
    protected Subject subject;
    public  abstract void update();
}
