package com.qingqiao.entity;

public class Mistakes {
    private Integer id;
    private String name;
    private Integer score;

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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Mistakes() {
    }

    public Mistakes(Integer id, String name, Integer score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}
