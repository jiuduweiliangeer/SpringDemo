package TestJDBCandMVC.dao;

import TestJDBCandMVC.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public boolean Getpassword(String username,String password){
        String sql="SELECT password FROM test WHERE username=?";
        String passwordcurrent=jdbcTemplate.queryForObject(sql,String.class,username);
        boolean s=password.equals(passwordcurrent);
        return s;
    }
}
