package cdxy.demo.lession6;

import cdxy.demo.lession6.service.StudentService;
import cdxy.demo.lession6.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("lession6.xml");
        StudentService studentService = (StudentService) ctx.getBean("studentService");
        studentService.add();
        TeacherService teacherService = (TeacherService) ctx.getBean("teacherService");
        teacherService.add();
    }
}
