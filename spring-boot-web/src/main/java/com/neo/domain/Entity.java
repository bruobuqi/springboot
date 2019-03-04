package com.neo.domain;

public class Entity {
   private String id;// 'id': 1,
    private String pid;//       'pid': -1,
    private String name;//        'name': 'lala01

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
