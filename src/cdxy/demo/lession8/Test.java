package cdxy.demo.lession8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*config配置aop*/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("lession8.xml");
        Aspectjinterfacetest aspectJImp= (Aspectjinterfacetest) ctx.getBean("aspectJImp");
        aspectJImp.test(1,2);
    }
}
