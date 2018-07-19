package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/10.
 * @Date 2018/7/10 14:10
 */
public class App  {

    static Thread t1 = new Thread(new Runnable() {
        public void run() {
            System.out.println("thread1");
        }
    });
    static Thread t2 = new Thread(new Runnable() {
        public void run() {
            System.out.println("thread2");
        }
    });
    static Thread t3  = new Thread(new Runnable() {
        public void run() {
            System.out.println("thread3");
        }
    });

    public static void main(String[] args) {
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
