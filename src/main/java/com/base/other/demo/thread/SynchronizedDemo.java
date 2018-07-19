package com.base.other.demo.thread;

/**
 * @DESC 类锁  对象锁
 * @Author by gl on 2018/7/10.
 * @Date 2018/7/10 14:22
 */
public class SynchronizedDemo {

    public static void main(String[] args) {

        synchronized (SynchronizedDemo.class){

        }

    }

    // 对象锁
    private void  demo(){
        synchronized (this){

        }
    }
}
