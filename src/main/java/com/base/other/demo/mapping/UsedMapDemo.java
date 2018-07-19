package com.base.other.demo.mapping;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @DESC 通过反射 操作属性和方法
 * @Author by gl on 2018/6/29.
 * @Date 2018/6/29 14:02
 */
public class UsedMapDemo {

    public static void main(String[] args) {

        try {
            //创建类
            Class<?> class1 = Class.forName("Person");
            //创建实例
            Object person = class1.newInstance();
            //获取ID属性
            Field idField = class1.getDeclaredField("id");
            //打破封装，实际上setAccessible是启用和禁用访问检查开关，并不是为true就能访问 为false就不能访问
            //由于JDK是安全检查耗时较多，所以通过setAccessible(true)的方式关闭安全检查就可以达到升级速度的目的

            idField.setAccessible(true);
            //给ID赋值
            idField.set(person,"100");

            //获取setName方法
            Method setName = class1.getDeclaredMethod("setName",String.class);

            setName.invoke(person,"geliang");

            Field nameField = class1.getDeclaredField("name");

            nameField.setAccessible(true);

            //输出person 的ID属性
            String id_ = (String) idField.get(person);
            System.out.println("id="+id_);

            //输出person的name属性
            String name_ = (String)nameField.get(person);
            System.out.println("name_="+name_);

            Method getName = class1.getDeclaredMethod("getName");
            getName.setAccessible(true);

            String name_2 = (String)getName.invoke(person);
            System.out.println("name2="+name_2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
