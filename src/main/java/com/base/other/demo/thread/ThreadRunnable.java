package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/4.
 * @Date 2018/7/4 18:20
 */
public class ThreadRunnable implements Runnable {
    public void run() {
        System.out.println("sub");
    }

    public static void main(String[] args) {
        ThreadRunnable sub = new ThreadRunnable();
        Thread thread = new Thread(sub);
        thread.start();

        try {
            Thread.sleep(1000);
            System.out.println("main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
