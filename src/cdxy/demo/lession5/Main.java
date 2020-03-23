package cdxy.demo.lession5;

import cdxy.demo.lession5.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("lession5.xml");
        /*TestComponent testComponent = (TestComponent) ctx.getBean("testComponent");
        System.out.println(testComponent);
        IUserRespository iUserRespository = (IUserRespository) ctx.getBean("userRespositoryImpl");
        System.out.println(iUserRespository);
        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService);
        UserController userController = (UserController) ctx.getBean("userController");
        System.out.println(userController);*/

        UserService userService = (UserService) ctx.getBean("userService");
        //userService.add();

    }
}
