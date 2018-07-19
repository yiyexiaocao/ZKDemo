package com.base.zk.demo;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * @DESC ZK API
 * @Author by gl on 2018/6/21.
 * @Date 2018/6/21 18:27
 */
public class CreateSession implements Watcher{

    private static ZooKeeper zooKeeper;

    public static void main(String[] args) throws IOException, InterruptedException {

        zooKeeper = new ZooKeeper("10.4.81.147:2181",5000,new CreateSession());
        System.out.println(zooKeeper.getState());
        Thread.sleep(Integer.MAX_VALUE);
    }

    public void process(WatchedEvent watchedEvent) {
        System.out.println("收到事件:"+watchedEvent);
    }
}
