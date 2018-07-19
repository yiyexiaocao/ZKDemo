package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/4.
 * @Date 2018/7/4 19:50
 */
public class ThreadRead extends Thread {
    public StringBuffer buffer;

    public ThreadRead(StringBuffer buffer){
        this.buffer = buffer;
    }
    public  void  run(){
        synchronized (this.buffer){
            if("".equals(this.buffer.toString().trim())){
                try {
                    buffer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("read start");
            System.out.println(this.buffer.toString());
            buffer.delete(0,buffer.toString().length());
            buffer.notify();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("read end");
        }
    }
}
