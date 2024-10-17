package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(10);
        students.add(new Student("Raquel", 32, Course.JAVA, 7.5));
        students.add(new Student("Matias", 15, Course.JAVA, 8.0));
        students.add(new Student("Maydo", 19, Course.ANGULAR, 7.0));
        students.add(new Student("Antonio", 46, Course.PHP, 5.0));
        students.add(new Student("Sonia", 29, Course.PHP, 6.5));
        students.add(new Student("Jose", 32, Course.JAVA, 4.5));
        students.add(new Student("Marisa", 23, Course.JAVA, 3.0));
        students.add(new Student("Santiago", 19, Course.ANGULAR, 9.0));
        students.add(new Student("Alexandra", 46, Course.PHP, 6.5));
        students.add(new Student("Ramon", 29, Course.PHP, 9.5));

        System.out.println("Name and age of all students");
        students.forEach(System.out::println);

        System.out.println("\nStudents starting with A");
        List<Student> studentsA =  students.stream()
                                    .filter(s -> s.getName().startsWith("A"))
                                    .toList();
        studentsA.forEach(System.out::println);

        System.out.println("\nStudents with score equal or greater than 5");
        students.stream()
                .filter(s -> s.getScore() >= 5.0)
                .forEach(System.out::println);

        System.out.println("\nStudents with score >= 5 & no son de PHP");
        students.stream()
                .filter(s -> s.getScore() >= 5.0)
                .filter(s -> s.getCourse() != Course.PHP)
                .forEach(System.out::println);

        System.out.println("\nStudents of JAVA that are > 18 years");
        students.stream()
                .filter(s -> s.getCourse() == Course.JAVA && s.getAge() >= 18)
                .forEach(System.out::println);
    }
}