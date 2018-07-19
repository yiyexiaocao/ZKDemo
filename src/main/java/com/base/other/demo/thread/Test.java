package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/9.
 * @Date 2018/7/9 17:55
 */
public class Test {

    public volatile int inc = 0;

     //线程不安全
    public void increase() {
        inc++;
    }
/* //synchronized 线程安全
    public synchronized void increase() {
        inc++;
    }

    */
/* // 线程安全Lock

    Lock lock = new ReentrantLock();

    public  void increase() {
        lock.lock();
        try {
            inc++;
        } finally{
            lock.unlock();
        }
    }

*/


/* //线程安全 AtomicInteger

    public  AtomicInteger inc = new AtomicInteger();

    public  void increase() {
        inc.getAndIncrement();
    }
*/

    public static void main(String[] args) {
        final Test test = new Test();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }

        while(Thread.activeCount()>2) {  //保证前面的线程都执行完
            Thread.yield();
        }
        System.out.println("inc = "+test.inc);
    }
}
