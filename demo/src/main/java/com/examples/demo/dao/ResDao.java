package com.examples.demo.dao;

import com.examples.demo.entity.Res;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ResDao {
    List<Res> findAllRes();
}
