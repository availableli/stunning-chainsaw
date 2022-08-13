package com.qingqiao.entity;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String hobby;
    private String address;
    private String birthday;
    private Integer score;

    private List<StuAndMis> stuAndMis;

    public Student(Integer id, String name, String sex, Integer age, String hobby, String address, String birthday, Integer score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hobby = hobby;
        this.address = address;
        this.birthday = birthday;
        this.score = score;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String date) {
        this.birthday = birthday;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<StuAndMis> getStuAndMis() {
        return stuAndMis;
    }

    public void setStuAndMis(List<StuAndMis> stuAndMis) {
        this.stuAndMis = stuAndMis;
    }
}
