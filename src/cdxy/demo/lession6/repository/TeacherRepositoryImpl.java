package cdxy.demo.lession6.repository;

import cdxy.demo.lession6.pojo.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepositoryImpl implements BaseRepository<Teacher> {
    @Override
    public void save() {
        System.out.println("TeacherRepositoryImpl save...");
    }
}
