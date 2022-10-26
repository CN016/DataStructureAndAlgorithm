package com.my016.pojo;

import java.util.Objects;

public class Student {
    private String name;
    private Integer age ;
    private Character sex;
    private String   ID;
    private Teacher  teacher;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", ID='" + ID + '\'' +
                ", teacher=" + teacher +
                '}'+'\n';
    }

    public Student() {
    }

    public Student(String name, Integer age, Character sex, String ID, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ID = ID;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(sex, student.sex) && Objects.equals(ID, student.ID) && Objects.equals(teacher, student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, ID, teacher);
    }
}
