package cdxy.demo.lession16_17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/lession16_17")
@Controller
public class ControllerTest {
    @RequestMapping("/method1")
    public String method1(){
        System.out.println("method1...");
        return "redirect:method2?name=tom";//重定向
        //return "redirect:/index.jsp";
       /* WEB-INF文件夹客户端不能直接访问
        return "redirect:/WEB-INF/view/hello.jsp";*/
    }
    @RequestMapping("/method2")
    public String method2(@RequestParam("name") String username){
        System.out.println("method2..."+username);
        return "hello";
    }
}
