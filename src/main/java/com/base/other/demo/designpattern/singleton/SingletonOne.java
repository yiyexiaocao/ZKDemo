package com.base.other.demo.designpattern.singleton;

/**
 * @DESC 单例模式-懒汉型,线程不安全
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 14:52
 */
public class SingletonOne {

    private  static SingletonOne instance;

    private  SingletonOne(){

    }

    public  static SingletonOne getInstance(){
        if(instance == null){
            instance = new SingletonOne();
        }
        return  instance;
    }
}
