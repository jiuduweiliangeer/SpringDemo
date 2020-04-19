package cdxy.demo.DemoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(value = "/hello")
    public String Test(){
        System.out.println("ssss");
        return "hello";
    }
}
