package cdxy.demo.lession12;

import cdxy.demo.lession12.pojo.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Locale;

@Controller
public class Controllertest {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("111");
        return "hello";
    }
    @RequestMapping(value = "/method",produces = {"text/html;charset=utf-8"})
    @ResponseBody
    public String method(){
        System.out.println("2345");
        return "张三！";
    }
    @RequestMapping(value = "/method1")
    public String method1(@CookieValue("JSESSIONID") String jesssion){
        System.out.println(jesssion);
        return "hello";
    }
    @RequestMapping(value="/method2")
    public String method2(@RequestParam(value = "name") String name,@RequestParam(value = "age",defaultValue = "0") String age){
        System.out.println(name);
        System.out.println(age);
        return "hello";
    }
    @RequestMapping(value="/method3/{numb}")
    public String method3(@PathVariable("numb") Integer size){
        System.out.println(size);
        return "hello";
    }
    @RequestMapping("/method4")
    public String method4(User user){
        System.out.println(user);
        return "hello";
    }
    @RequestMapping("/method5")
    public String method5(HttpServletRequest request,
                          InputStream inputStream,
                          Locale locale){
        String language=locale.getDisplayLanguage();
        try {
            InputStream inputStream1=request.getInputStream();
            System.out.println("language:"+language);
            System.out.println("request.getInputStream():"+inputStream1);
            System.out.println("InputStream:"+inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hello";
    }
}
