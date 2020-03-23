package cdxy.demo.lession7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("lession7.xml");
        AspectJImp aspectJImp= (AspectJImp) ctx.getBean("aspectJImp");
        int result=aspectJImp.test(1,2);
        System.out.println(result);
    }
}
