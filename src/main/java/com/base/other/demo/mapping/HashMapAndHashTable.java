package com.base.other.demo.mapping;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/2.
 * @Date 2018/7/2 9:29
 */
public class HashMapAndHashTable {

    public static void main(String[] args) {

        Hashtable table = new Hashtable();
        table.put("key","value");
        Enumeration em = table.elements();
        while (em.hasMoreElements()){
            String obj = (String) em.nextElement();
            System.out.println(obj);
        }

    }
}
