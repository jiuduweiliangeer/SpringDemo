package TestJDBCandMVC.controller;

import TestJDBCandMVC.dao.StudentDAO;
import cdxy.demo.lession6.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class TestController {
    @Autowired
    private StudentDAO studentDAO;
    @RequestMapping("/login")
    public String login(Map<String,Object> map){
        map.put("student",new Student());
        return "TestJDBCandMVC/Login";
    }
    @RequestMapping("/student")
    public String TestLogin(@RequestParam("username") String username,@RequestParam("password") String password){
        boolean demo=studentDAO.Getpassword(username,password);
        if (demo){
            return "TestJDBCandMVC/yes";
        }else{
            return "TestJDBCandMVC/false";
        }
    }

}
