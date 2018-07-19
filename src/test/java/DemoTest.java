import com.base.other.demo.bind.StaticAndDynaBindDemo;
import com.base.other.demo.bind.subStaticAndDynaBindDemo;

/**
 * @DESC 描述
 * @Author by gl on 2018/6/27.
 * @Date 2018/6/27 10:19
 */
public class DemoTest {

    public static void main(String[] args) {
      //  System.out.println(2<<1);

        StaticAndDynaBindDemo sta = new subStaticAndDynaBindDemo();
        StaticAndDynaBindDemo.f();
    }

}
