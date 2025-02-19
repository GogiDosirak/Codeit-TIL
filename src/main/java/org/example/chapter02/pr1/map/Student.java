package org.example.chapter02.pr1.map;

import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private int score;

    public Student(String name, int id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return id == student.id && score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
