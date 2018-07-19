package com.base.other.demo.mapping;

/**
 * @DESC 获取类的方法
 * @Author by gl on 2018/6/29.
 * @Date 2018/6/29 10:48
 */
public class GetClassMethods {

    public static void main(String[] args) {

       //第一种：Class.forName()
        try {

            Class<?> class1 = Class.forName("Person");
            System.out.println(class1);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //第二种：类.Class
        Class<?> class2 = Person.class;
        System.out.println(class2);

        //第三种：实例对象.getClass()
        Person person = new  Person();
        Class<?> class3 = person.getClass();
        System.out.println(class3);


    }
}
