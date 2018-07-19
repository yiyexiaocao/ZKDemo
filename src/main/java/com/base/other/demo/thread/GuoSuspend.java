package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/4.
 * @Date 2018/7/4 19:38
 */
public class GuoSuspend extends Thread {

    public  void  run(){

        for(int i=0;i<5;i++){
            System.out.println("thread :"+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        GuoSuspend t = new GuoSuspend();
        t.start();

        Thread.sleep(1000);

        System.out.println("main suspend start");

        t.suspend();

        Thread.sleep(5000);

        t.resume();

        System.out.println("main resume end");
    }
}
