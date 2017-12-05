package com.examples.demo.dao;

import com.examples.demo.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Mapper
public interface RoleDao {
    List<Role> findAllRole();
}
