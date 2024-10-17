package org.example;

public class Student {

    private String name;
    private Integer age;
    private Course course;
    private double score;

    public Student(String name, Integer age, Course course, double score) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Course getCourse() {
        return course;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student: " + name + " Age: " + age;
    }
}
