package com.example.demo2;

public class StudentDataLayer {
    private int id;
    private String fullName;
    private Integer grade;

    public StudentDataLayer(int id, String name, Integer grade) {
        this.id = id;
        this.fullName = name;
        this.grade = grade;

    }

    public StudentDataLayer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
