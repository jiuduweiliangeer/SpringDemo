package cdxy.demo.lession12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
}
