package com.base.other.demo.designpattern.observer;

/**
 * @DESC 用于在易用和低耦合下实现一个对象改变给其他对象通知的功能
 *       优点：观察者和被观察抽象耦合的
 *       缺点：当观察者较多时，完成通知耗时较长，观察者和被观察是循环依赖时，会导致循环调用，可能会使导致系统崩溃
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:43
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("first state change:15");
        subject.setState(15);
        System.out.println("second state change: 10");
        subject.setState(10);
    }
}
