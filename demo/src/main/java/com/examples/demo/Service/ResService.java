package com.examples.demo.Service;

import com.examples.demo.dao.ResDao;
import com.examples.demo.entity.Res;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResService {
    @Autowired
    private ResDao rsd;

    public List<Res> findAllRes(){
        return rsd.findAllRes();
    }

}
