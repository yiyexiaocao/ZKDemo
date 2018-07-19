package com.base.other.demo.designpattern.observer;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:42
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Octal String:"+Integer.toOctalString(subject.getState()));
    }
}
