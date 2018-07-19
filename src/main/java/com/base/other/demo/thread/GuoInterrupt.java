package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/4.
 * @Date 2018/7/4 18:54
 */
public class GuoInterrupt  extends  Thread{

    private  boolean stop = false;

    public  void  run(){
        long time = 0;
        while(!this.stop){
            System.out.println("t1 running ........"+Math.random());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("t1 is interrupting.........");
            }
        }
        System.out.println("t1 is end");
    }

    public static void main(String[] args) throws InterruptedException {
        GuoInterrupt t1 = new GuoInterrupt();
        System.out.println("app is starting");
        t1.start();
        Thread.sleep(3000);
        System.out.println("Interrupting t1 .........");
        t1.interrupt();
        Thread.sleep(10000);
        System.out.println("app is end");
        t1.stop = true;
        Thread.sleep(1000);
        System.exit(0);
    }
}
