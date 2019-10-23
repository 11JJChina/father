package com.miu.entity;

public class User {
    private Integer id;
    private String username;
    private String pwd;
    private Integer age;
    private String name;
    private float height;

    public User() {
    }

    public User(Integer id, String username, String pwd, Integer age, String name, float height) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
