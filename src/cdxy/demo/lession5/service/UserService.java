package cdxy.demo.lession5.service;

import cdxy.demo.lession5.repository.IUserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    @Qualifier(value = "userRepositoryImpl")
    private IUserRespository iUserRespository;

    /*@Autowired
        @Qualifier(value = "userRepositoryImpl")
        public void setiUserRespository(IUserRespository iUserRespository) {
            this.iUserRespository = iUserRespository;
        }
    */

    /*@Autowired
    public void setiUserRespository(@Qualifier(value = "userRepositoryImpl") IUserRespository iUserRespository) {
        this.iUserRespository = iUserRespository;
    }*/

    public void add(){
        iUserRespository.save();
    }
}
