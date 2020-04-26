package cdxy.demo.lession16_17.Controller;

import cdxy.demo.lession16_17.dao.DepartementDaoI;
import cdxy.demo.lession16_17.dao.TeacherDaoI;
import cdxy.demo.lession16_17.pojo.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private TeacherDaoI teacherDaoI;
    @Autowired
    private DepartementDaoI departementDaoI;
    @RequestMapping("/users")
    public String list(Map<String,Object> map){
        map.put("teacher",teacherDaoI.getAll());
        return "lession16_17/list";
    }
}
