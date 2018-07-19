package com.base.other.demo.designpattern.singleton;

/**
 * @DESC 单例模式-恶汉型，线程安全
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 14:52
 */
public class SingletonThree {

    private  static SingletonThree instance = new SingletonThree();

    private SingletonThree(){

    }

    public  static SingletonThree getInstance(){
        return  instance;
    }
}
