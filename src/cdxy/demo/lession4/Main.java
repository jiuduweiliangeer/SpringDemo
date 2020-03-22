package cdxy.demo.lession4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("lession4.xml");
        IPet pet4 = (IPet) ctx.getBean("pet4");
        pet4.eat();
        pet4.run();
        ctx.close();

    }
}
