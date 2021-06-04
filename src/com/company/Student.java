package com.company;


public class Student {
    private String name;
    private String uid;
    private int age;
    private int form;
    private int gradeMath;
    private int gradeRussian;
    private int gradeSocial;
    private int gradeDesign;
    private int gradeLiterature;
    
    public Student(String name, int age, int form) {
        this.name = name;
        this.age = age;
        this.form = form;
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

    public int getForm() {
        return form;
    }

    public void setForm(int form) {
        this.form = form;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(int gradeMath) {
        this.gradeMath = gradeMath;
    }

    public int getGradeRussian() {
        return gradeRussian;
    }

    public void setGradeRussian(int gradeRussian) {
        this.gradeRussian = gradeRussian;
    }

    public int getGradeSocial() {
        return gradeSocial;
    }

    public void setGradeSocial(int gradeSocial) {
        this.gradeSocial = gradeSocial;
    }

    public int getGradeDesign() {
        return gradeDesign;
    }

    public void setGradeDesign(int gradeDesign) {
        this.gradeDesign = gradeDesign;
    }

    public int getGradeLiterature() {
        return gradeLiterature;
    }

    public void setGradeLiterature(int gradeLiterature) {
        this.gradeLiterature = gradeLiterature;
    }

}