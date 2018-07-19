package com.base.other.demo.designpattern.singleton;

/**
 * @DESC 单例模式=静态内部类
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 14:58
 */
public class InternalClass {

    private  static class InternalClassOne{
        private static final InternalClass INTERNALCLASSONE = new InternalClass();
    }

    private InternalClass(){

    }

    public  static final InternalClass getInstance(){
        return InternalClassOne.INTERNALCLASSONE;
    }
}
