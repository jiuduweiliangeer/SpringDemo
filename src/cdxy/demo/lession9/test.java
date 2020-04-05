package cdxy.demo.lession9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:lession9.xml")
public class test {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void selectTest(){
        String sql="SELECT uid FROM project_stu WHERE username = ?";
        double s=jdbcTemplate.queryForObject(sql,double.class,"demo");
        System.out.println(s);

    }
}
