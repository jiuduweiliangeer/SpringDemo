package cdxy.demo.lession6.service;

import cdxy.demo.lession6.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
    @Autowired
    private BaseRepository<T> baseRepository;
    public void add(){
        baseRepository.save();
    }
}
