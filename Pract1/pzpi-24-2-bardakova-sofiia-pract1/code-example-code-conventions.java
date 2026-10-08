// Найменування класів
// Поганий приклад
class student_data {
}

// Гарний приклад
class StudentData {
}

//Найменування пакетів
// Поганий приклад
package MyProject;

// Гарний приклад
package myproject;
package studentdata;
package com.example.myproject;

// Правила найменування логічних змінних і методів
// Поганий приклад
boolean visible;
boolean finished;

// Гарний приклад
boolean isVisible;
boolean isFinished;
public void setFound(boolean isFound) {
    this.found = isFound;
}

// Порядок розташування елементів усередині класу
public class Student {
    // Поля
    private static int studentCount;
    private String name;
    private int age;

    // Конструктор
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Методи
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Структура вихідного файлу
// Copyright (c) 2026 Sofiia Bardakova.

package com.example.student;

import java.util.List;

public class Student {

    // Class contents
}

// Використання фігурних дужок
// Поганий приклад
if (age >= 18)
        {
        System.out.println("Adult");
}

// Гарний приклад
        if (age >= 18) {
        System.out.println("Adult");
}


// Пробіли навколо операторів
// Поганий приклад
int result=a+b;
if(age>=18){ }

// Гарний приклад
int result = a + b;
if (age >= 18) { }

// Довжина рядка
// Поганий приклад
public void calculateStudentAverageGrade(Student student, List<Double> grades, boolean includeExtraCredits) { }

// Гарний приклад
public void calculateStudentAverageGrade(
        Student student,
        List<Double> grades,
        boolean includeExtraCredits) {
}

// Рефакторинг методом Extract Method
// До рефакторингу
public void processStudent(Student student) {
    System.out.println(student.getName());

    if (student.getGrade() >= 60) {
        System.out.println("Passed");
    }
}

// Після рефакторингу
public void processStudent(Student student) {
    printStudentName(student);
    checkResult(student);
}

private void printStudentName(Student student) {
    System.out.println(student.getName());
}

private void checkResult(Student student) {
    if (student.getGrade() >= 60) {
        System.out.println("Passed");
    }
}
