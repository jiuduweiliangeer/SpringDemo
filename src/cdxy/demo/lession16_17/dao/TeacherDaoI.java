package cdxy.demo.lession16_17.dao;

import cdxy.demo.lession16_17.pojo.Departement;
import cdxy.demo.lession16_17.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class TeacherDaoI {
    @Autowired
    private DepartementDaoI departementDaoI;
    private static Map<Integer, Teacher> teacherMap=null;
    static {
        teacherMap =new HashMap<Integer, Teacher>();
        teacherMap.put(100,new Teacher(100,"Tom","123456",1,"tom@qq.com",new Departement(1,"computer")));
        teacherMap.put(101,new Teacher(101,"jerry","123456",1,"jerry@qq.com",new Departement(1,"computer")));
        teacherMap.put(102,new Teacher(102,"jack","123456",1,"jack@qq.com",new Departement(2,"software")));
        teacherMap.put(103,new Teacher(103,"trump","123456",1,"trump@qq.com",new Departement(1,"computer")));
        teacherMap.put(104,new Teacher(104,"Ombama","123456",0,"Ombama@qq.com",new Departement(1,"computer")));
    }
    private static Integer initID=104;
    public Collection<Teacher> getAll(){
        return teacherMap.values();
    }
    public Teacher getTeacherByID(Integer id){
        return teacherMap.get(id);
    }
    public void saveAndUpdate(Teacher teacher){
        if (teacher.getId()==null){
            teacher.setId(++initID);
            Integer departementID=teacher.getDepartement().getId();
            Departement departement=departementDaoI.getDepartmentById(departementID);
            teacher.setDepartement(departement);
            teacherMap.put(initID,teacher);
        }
    }
    public void delete(Integer id){
        teacherMap.remove(id);
    }
}
