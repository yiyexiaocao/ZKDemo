package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/10.
 * @Date 2018/7/10 18:37
 */
public class WaitNotifyDemo implements  Runnable {
    private  String name;
    private Object prev;
    private Object self;

    public WaitNotifyDemo(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    public void run() {
        int count=10;
        while (count>0){
            synchronized (prev){
                synchronized (self){
                    System.out.println(name);
                    count--;
                    try {
                        Thread.sleep(1);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    self.notify();
                }

                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        WaitNotifyDemo pa = new WaitNotifyDemo("A",c,a);
        WaitNotifyDemo pb = new WaitNotifyDemo("B",a,b);
        WaitNotifyDemo pc = new WaitNotifyDemo("C",b,c);

        new  Thread(pa).start();
        Thread.sleep(10);
        new  Thread(pb).start();
        Thread.sleep(10);
        new  Thread(pc).start();
        Thread.sleep(10);
    }
}
