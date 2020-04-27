package cdxy.demo.lession16_17.Controller;

import cdxy.demo.lession16_17.dao.DepartementDaoI;
import cdxy.demo.lession16_17.dao.TeacherDaoI;
import cdxy.demo.lession16_17.pojo.Departement;
import cdxy.demo.lession16_17.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TeacherController {
    @Autowired
    private TeacherDaoI teacherDaoI;
    @Autowired
    private DepartementDaoI departementDaoI;
    @RequestMapping("/teachers")
    public String list(Map<String,Object> map){
        map.put("teacher",teacherDaoI.getAll());
        return "lession16_17/list";
    }
    //进入input新增页面
    @RequestMapping( value ="/teacher",method = RequestMethod.GET)
    public String input(Map<String,Object> map){
        Map<Integer,String> genders=new HashMap<>();
        genders.put(1,"M");
        genders.put(0,"W");
        map.put("genders",genders);
        map.put("departements",departementDaoI.getAll());
        map.put("teacher",new Teacher());
        return "lession16_17/input";
    }
    //新增or修改数据
    @RequestMapping(value = "/teacher",method = RequestMethod.POST)
    public String save(Teacher teacher){
        System.out.println(teacher);
        teacherDaoI.saveAndUpdate(teacher);
        return "redirect:/teachers";
    }
    //删除数据
    @RequestMapping(value = "/teacher/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id){
        teacherDaoI.delete(id);
        return "redirect:/teachers";
    }
    //进入input修改页面
    @RequestMapping(value = "/teacher/{id}",method = RequestMethod.GET)
    public String input(@PathVariable("id") Integer id,Map<String,Object> map){
        Map<Integer,String> genders=new HashMap<>();
        genders.put(1,"M");
        genders.put(0,"W");
        map.put("genders",genders);
        map.put("departements",departementDaoI.getAll());
        map.put("teacher",teacherDaoI.getTeacherByID(id));
        return "lession16_17/input";
    }
}
