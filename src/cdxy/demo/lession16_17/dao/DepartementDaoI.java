package cdxy.demo.lession16_17.dao;

import cdxy.demo.lession16_17.pojo.Departement;
import com.sun.jmx.snmp.defaults.DefaultPaths;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DepartementDaoI {
    private static Map<Integer, Departement> departementMap=null;
    static {
        departementMap=new HashMap<>();
        departementMap.put(1,new Departement(1,"computer"));
        departementMap.put(2,new Departement(2,"software"));
    }
    public Collection<Departement> getAll(){
        return departementMap.values();
    }
    public Departement getDepartmentById(Integer id){
        return  departementMap.get(id);
    }
}
