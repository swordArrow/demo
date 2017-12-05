package com.examples.demo.controller;

import com.examples.demo.Service.ResService;
import com.examples.demo.entity.Res;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResController {

    @Autowired
    private ResService rs;

    @RequestMapping("findAllRes")
    public List<Res> findAllRes(){
            return rs.findAllRes();
    }
}
