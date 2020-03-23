package cdxy.demo.lession5.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJDBCRepositoryImpl implements IUserRespository {
    @Override
    public void save() {
        System.out.println("UserJDBCRepositoryImpl save...");
    }
}
