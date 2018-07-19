package com.base.other.demo.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:35
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllOververs();
    }

    public void notifyAllOververs(){
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
