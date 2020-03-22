package cdxy.demo.lession3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("lession3.xml");
        /*Student s1 = (Student) ctx.getBean("s1");
        System.out.println(s1);*/
        /*Address add2 = (Address) ctx.getBean("add2");
        System.out.println(add2);*/
        Student s5 = (Student) ctx.getBean("s5");
        System.out.println(s5);

    }

}
