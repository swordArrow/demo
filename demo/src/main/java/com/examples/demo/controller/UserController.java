package com.examples.demo.controller;

import com.examples.demo.Service.UserService;
import com.examples.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping("find")
    public List<User> findAll(){
        return us.findAllUser();
    }
    @RequestMapping("saveUser")
    public void addUser(User user){
        int id=user.getId();
        if (id !=0){
            us.updateUser(user);
        }else {
            us.addUser(user);
        }
    }
    //删除用户

    @RequestMapping("deleteUser") //
    public String deleteUser( @RequestBody ArrayList<Integer> data){
        us.deleteUser(data);
        return "1";
    }
}
