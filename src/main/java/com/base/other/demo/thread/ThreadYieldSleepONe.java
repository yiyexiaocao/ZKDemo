package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/4.
 * @Date 2018/7/4 18:27
 */
public class ThreadYieldSleepONe implements Runnable {
    private  String name;

    public void run() {
        for(int i=0;i<10;i++){

            try {
                // Thread.yield();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+":"+i+" "+Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        ThreadYieldSleepONe one = new ThreadYieldSleepONe();
        ThreadYieldSleepONe two = new ThreadYieldSleepONe();
        one.name = "one";
        two.name = "two";
        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);
        t1.setPriority(Thread.MAX_PRIORITY);
        //t2.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
