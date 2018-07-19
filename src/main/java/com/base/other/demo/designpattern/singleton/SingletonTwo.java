package com.base.other.demo.designpattern.singleton;

/**
 * @DESC 单例模式-懒汉型，线程安全
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 14:52
 */
public class SingletonTwo {

    private  static SingletonTwo instance;

    private SingletonTwo(){

    }

    public  static synchronized SingletonTwo getInstance(){
        if(instance == null){
            instance = new SingletonTwo();
        }
        return  instance;
    }
}
