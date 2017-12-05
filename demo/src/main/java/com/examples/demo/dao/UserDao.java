package com.examples.demo.dao;

import com.examples.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.xml.ws.soap.MTOM;
import java.util.List;

@Repository
@Mapper
public interface UserDao {
    void addUser(User user);
    List<User> findAllUser();
    void deleteUser(List<Integer> list);
    void updateUser(User user);
}
