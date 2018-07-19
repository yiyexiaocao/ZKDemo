package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/4.
 * @Date 2018/7/4 19:32
 */
public class ThreadJoinTwo extends Thread {

    public  void  run(){
        synchronized (this){
            System.out.println("join start");

            try {
                Thread.sleep(9000);
                for(int i=0; i<5;i++){
                    System.out.println("sub thread:"+i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("interrupt exception");
            }
            System.out.println("join end");
        }
    }

    public static void main(String[] args) {
        ThreadJoinTwo t = new ThreadJoinTwo();

        try {

            t.start();
            Thread.sleep(1000);
            System.out.println("main join start");
            t.join(1000);//等待一个线程直到它死亡
            System.out.println("main join end");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
