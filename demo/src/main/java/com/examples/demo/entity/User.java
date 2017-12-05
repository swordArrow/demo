package com.examples.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable{
    private  int id;
    private  String account;
    private  String pwd;
    private Set<Role> set = new HashSet<>();

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Set<Role> getSet() {
        return set;
    }

    public void setSet(Set<Role> set) {
        this.set = set;
    }
}
