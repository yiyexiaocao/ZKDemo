package com.base.other.demo.designpattern.Decorator;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:26
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decorateShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decorateShape = decoratedShape;
    }

    public void draw(){
        decorateShape.draw();
    }
}
