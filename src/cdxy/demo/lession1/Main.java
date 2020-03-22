package cdxy.demo.lession1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       /* HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("hello");
        helloWorld.say();*/
       //1、初始化ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器对象获取bean
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");
       /* 通过类型获取bean需要保证容器中这种类型的bean只有一个
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);*/
        helloWorld.say();

    }
}
