package cdxy.demo.lession6.repository;

import cdxy.demo.lession6.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements BaseRepository<Student> {
    @Override
    public void save() {
        System.out.println("StudentRepositoryImpl save...");
    }
}
