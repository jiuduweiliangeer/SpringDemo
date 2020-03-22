package cdxy.demo.lession2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("lession2.xml");
       /* Book book1 = (Book) ctx.getBean("book1");
        System.out.println(book1);*/
       /*Student s1 = (Student) ctx.getBean("s1");
        System.out.println(s1);*/
       /*Teacher t2 = (Teacher) ctx.getBean("t2");
        System.out.println(t2);*/
       Student s2 = (Student) ctx.getBean("s2");
        System.out.println(s2);
    }
}
