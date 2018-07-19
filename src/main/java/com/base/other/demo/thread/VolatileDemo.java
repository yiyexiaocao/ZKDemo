package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/9.
 * @Date 2018/7/9 17:40
 */
public class VolatileDemo {

    public   int inc = 0;

    public  synchronized  void  increase(){
        inc++;
    }

    public static void main(String[] args) {
        final  VolatileDemo test = new VolatileDemo();
        for(int i=0;i<1;i++){
            new  Thread(){
                public void run(){
                    for(int j=0;j<10;j++){
                        test.increase();
                    }
                };
            }.start();
        }

        while (Thread.activeCount()>1){
            Thread.yield();
        }

        System.out.println(test.inc);

    }

}
