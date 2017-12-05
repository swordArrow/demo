package com.examples.demo.controller;

import com.examples.demo.Service.RoleService;
import com.examples.demo.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService rs;
    @RequestMapping("list")
    public List<Role> listRole(){
        return rs.findAllRole();
    }
}
