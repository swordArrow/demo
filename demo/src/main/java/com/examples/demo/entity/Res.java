package com.examples.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Res implements Serializable {

    private int id;

    private String text;
    private String url;
    private Set<Res> children= new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<Res> getChildren() {
        return children;
    }

    public void setChildren(Set<Res> children) {
        this.children = children;
    }
}
