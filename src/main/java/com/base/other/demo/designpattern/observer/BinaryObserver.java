package com.base.other.demo.designpattern.observer;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:39
 */
public class BinaryObserver extends Observer {
    public  BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update() {
        System.out.println("Binary String:"+Integer.toBinaryString(subject.getState()));
    }
}
