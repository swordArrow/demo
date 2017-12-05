package com.examples.demo.Service;

import com.examples.demo.dao.RoleDao;
import com.examples.demo.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleDao rd;

    public List<Role> findAllRole(){
        return  rd.findAllRole();
    }
}
