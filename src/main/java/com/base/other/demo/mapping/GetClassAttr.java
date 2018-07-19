package com.base.other.demo.mapping;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @DESC 描述
 * @Author by gl on 2018/6/29.
 * @Date 2018/6/29 11:25
 */
public class GetClassAttr {

    public static void main(String[] args) {

        Class<?> class1 = null;

        try {

            class1 = Class.forName("Person");
            //获取类的所有公共方法
            Method[] methods = class1.getMethods();
            for(Method method : methods){
                System.out.println(method);
            }
            //获取所有的接口
            Class<?>[] inters = class1.getInterfaces();
            for(Class<?> class2 : inters){
                System.out.println(class2);
            }

            //获取父类
            Class<?> superClass = class1.getSuperclass();
            System.out.println(superClass);

            //获取构造函数
            Constructor<?>[] constructors = class1.getConstructors();
            for(Constructor<?> constructor : constructors){
                System.out.println(constructor);
            }


            /**
             *  获取所有属性
             *  getDeclaredFields()获得某个类的所有申明的字段，即包括public、private和proteced，但是不包括父类的申明字段。
             *  getFields()获得某个类的所有的公共（public）的字段，包括父类。
             */


            Field[] fields = class1.getDeclaredFields();
            for(Field field : fields){
                System.out.println("declaredField---"+field);
            }

            Field[] fields2 = class1.getFields();
            for(Field field :fields2){
                System.out.println("dField---"+field);
            }


            //创建实例化：相当于New一个对象
            Object obj = class1.newInstance();
            //向下转型
            Person person = (Person)obj;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }


}
