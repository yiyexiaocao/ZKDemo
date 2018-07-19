package com.base.other.demo.designpattern.proxy;

/**
 * @DESC 为其他对象提供一种代理来控制对某个对象的访问，在一些已有的方法在使用的时候需要对已有的方法进行拓展，可用此模式来完成
 *       优点：职责清晰，有更高的拓展性，更加的智能。
 *       缺点：实现代理模式增加了工作量，且通过代理模式访问会使性能降低。
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:16
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy(){
        this.source = new Source();
    }

    public void method() {
        if(source == null){
            source = new Source();
        }
        source.method();
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.method();
    }
}
