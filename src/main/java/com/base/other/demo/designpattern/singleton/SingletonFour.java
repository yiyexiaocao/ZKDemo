package com.base.other.demo.designpattern.singleton;

/**
 * @DESC 单例模式-双检锁/双重检验锁，线程安全
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 14:52
 */
public class SingletonFour {

    private  volatile static SingletonFour instance ;

    private SingletonFour(){

    }

    public  static SingletonFour getInstance(){
        if(instance == null){
            synchronized (SingletonFour.class){
                instance = new SingletonFour();
            }
        }
        return  instance;
    }
}
