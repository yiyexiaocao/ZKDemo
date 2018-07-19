package com.base.other.demo.keyword;

import java.io.*;

/**
 * @DESC 描述
 * @Author by gl on 2018/7/9.
 * @Date 2018/7/9 15:54
 */
public class TransientTest implements Serializable {

    private static final long serialVersionUID = 1L;

    //private  String name;
    private   static String name;
    private transient String pwd;

    public TransientTest(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "TransientTest{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public static void main(String[] args) {

        TransientTest test = new TransientTest("葛亮","123456");
        System.out.println(test);
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("transient.txt"));
            out.writeObject(test);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        ObjectInputStream in  = null;
        try {
            test.setName("笨蛋");
            in = new ObjectInputStream(new FileInputStream("transient.txt"));
            TransientTest testDemo = (TransientTest)in.readObject();
            System.out.println(testDemo);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
