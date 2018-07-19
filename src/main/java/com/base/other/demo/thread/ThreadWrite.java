package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/4.
 * @Date 2018/7/4 19:46
 */
public class ThreadWrite extends Thread {

    public  StringBuffer buffer;

    public  ThreadWrite(StringBuffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        synchronized (this.buffer){
            if(!"".equals(this.buffer.toString())){
                try {
                    buffer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Write start");
            this.buffer.append("123");
            this.buffer.notify();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Write end");
        }
    }
}
