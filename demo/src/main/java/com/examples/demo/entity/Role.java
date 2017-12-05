package com.examples.demo.entity;

import java.io.Serializable;

public class Role implements Serializable{
    private Integer id;
    private String rname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
}
