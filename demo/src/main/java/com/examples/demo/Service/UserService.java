package com.examples.demo.Service;

import com.examples.demo.dao.UserDao;
import com.examples.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
        @Autowired
        private UserDao ud;
        public List<User> findAllUser(){

                return ud.findAllUser();

        }

        public void addUser(User user){
            ud.addUser(user);
        }
        public void deleteUser(List<Integer> list){
            ud.deleteUser(list);
        }
        public void updateUser(User user){
            ud.updateUser(user);
        }
}
