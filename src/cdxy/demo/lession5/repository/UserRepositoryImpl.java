package cdxy.demo.lession5.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements IUserRespository {
    @Override
    public void save() {
        System.out.println("UserRepositoryImpl save()...");
    }
}
