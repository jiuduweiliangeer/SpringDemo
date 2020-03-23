package cdxy.demo.lession5.controller;


import cdxy.demo.lession5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void execute(){
        userService.add();
    }

}
