package com.base.other.demo.designpattern.Decorator;

/**
 * @DESC 通过一个更加灵活的方式动态的为某一个对象添加一些额外的职责
 *       优点：可以再不添加很多子类的情况下拓展类，且装饰类和被装饰类可以独立方法。
 *       缺点：多层装饰较为复杂
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 15:27
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setRedBorder(Shape deocratedShape){
        System.out.println("Border Color:Red");
    }
    public void draw(){
        decorateShape.draw();
        setRedBorder(decorateShape);
    }

    public static void main(String[] args) {
        ShapeDecorator decorator = new RedShapeDecorator(new Rectangle());
        decorator.draw();
    }
}
