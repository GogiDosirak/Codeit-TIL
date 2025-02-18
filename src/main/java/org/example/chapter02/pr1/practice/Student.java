package org.example.chapter02.pr1.practice;

public class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    // toString을 사용하면 해당 내용 반환, 또는 그냥 객체 자체를 호출해서 toString이 나감
    // 객체 정보를 문자열로 사용해야할 때 이용
}
