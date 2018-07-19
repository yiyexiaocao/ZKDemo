package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/4.
 * @Date 2018/7/4 18:17
 */
public class OntThread extends Thread {

    public  void run(){
        System.out.println("sub");
    }

    public static void main(String[] args) {
        OntThread ont = new OntThread();
        ont.start();
        try {
            Thread.sleep(1000);
            System.out.println("main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
