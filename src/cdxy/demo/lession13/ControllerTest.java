package cdxy.demo.lession13;

import cdxy.demo.lession13.pojo.User;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/lession13")
public class ControllerTest {
    @RequestMapping("/method1")
    public String method1(@RequestParam("name") String name, Map<String,Object> map){
        System.out.println("method1....");
        map.put("name",name);
        return "hello";
    }
    @RequestMapping("/method2")
    public String method2(){
        System.out.println("method2....");
        return "hello";
    }
    @ModelAttribute
    public void testModleAttribute2(@RequestParam(value = "name",required = false) String username,Map<String,Object> map){
        System.out.println("testModleAttributes2...");
        map.put("username",username);
    }
    @RequestMapping("/method3")
    public String method(){
        System.out.println("method3...");
        return "hello";
    }
    @ModelAttribute
    public User testModleAttributes3(){
        System.out.println("testModleAttributes3...");
        User u=new User(1,"WJ","09128",21,"64030931@qq.com");
        return u;
    }
    @RequestMapping("/method4")
    public String method4(){
        System.out.println("method4...");
        return "hello";
    }
    @ModelAttribute("yh")
    public User testModleAttributes4(){
        System.out.println("testModleAttributes4...");
        User user=new User(2,"WJ","09128",20,"64030931@qq.com");
        return user;
    }
    @RequestMapping("/method5")
    public String method5(){
        System.out.println("method5...");
        return "hello";
    }
    @ModelAttribute
    public String testModleAttributes5(){
        System.out.println("testModleAttributes5...");
        return "hello world!";
    }
    @RequestMapping("/method6")
    public String method6(@ModelAttribute("user1") User user){
        System.out.println("method6..."+user);
        return "hello";
    }
    @ModelAttribute
    public void testModelAttributes6(Map<String,Object> map){
        System.out.println("testModelAttributes6...");
        User user1=new User(3,"Wj","090878",20,"64030931@qq.com");
        map.put("user1",user1);
    }
    @RequestMapping("/method7")
    public String method7(@ModelAttribute("abc") User user){
        System.out.println("method7..."+user);
        return "hello";
    }
    @ModelAttribute
    public void TestModelAttributes7(@RequestParam("id") Integer id,Map<String,Object> map){
        if(id!=null){
            System.out.println("TestModelAttributes7...");
            User user=new User(5,"Trump","990817",65,"64030931@qq.com");
            System.out.println("模拟数据库查询"+user);
            map.put("abc",user);
        }
    }
}
