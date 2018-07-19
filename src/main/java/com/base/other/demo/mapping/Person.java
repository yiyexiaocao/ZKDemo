package com.base.other.demo.mapping;

/**
 * @DESC 描述
 * @Author by gl on 2018/6/29.
 * @Date 2018/6/29 10:44
 */
public class Person implements InterFace {

    private String id;
    private String name;
    public  String age;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private static void  update(){

    }

    public void read() {

    }
}
