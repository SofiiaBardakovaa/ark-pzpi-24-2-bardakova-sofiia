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
