package cdxy.demo.lession7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*注解方式实现aop*/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("lession7.xml");
        Aspectjinterfacetest aspectJImp= (Aspectjinterfacetest) ctx.getBean("aspectJImp");
        aspectJImp.test(1,2);
    }
}
