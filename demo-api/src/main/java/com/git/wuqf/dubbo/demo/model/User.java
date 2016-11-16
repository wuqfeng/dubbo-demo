package com.git.wuqf.dubbo.demo.model;

import java.io.Serializable;

/**
 * Created by wuqf on 16-11-16.
 */
public class User implements Serializable{
    private int id;
    private String name;
    private int age;

    public User(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "id is "+id+" .user name is "+name+" .age is "+age;
    }
}
