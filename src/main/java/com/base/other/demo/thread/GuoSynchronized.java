package com.base.other.demo.thread;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/4.
 * @Date 2018/7/4 19:54
 */
public class GuoSynchronized {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("");
        ThreadWrite write = new ThreadWrite(buffer);
        ThreadRead read = new ThreadRead(buffer);
        read.start();
        write.start();
    }
}
