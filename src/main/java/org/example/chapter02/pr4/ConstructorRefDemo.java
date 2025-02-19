package org.example.chapter02.pr4;

public class ConstructorRefDemo {

    public static void main(String[] args) {
        PersonFactory factory1 = (name, age) -> new Person(name, age);
        // 풀어서 쓰면 PersonFactory factory1 = (name, age) -> {return new Person(name, age)};
        PersonFactory factory2 = Person::new; //생성자를 참조하여 인자 두개 받아서 Person 객체를 반환

        Person p1 = factory1.create("Kim", 30);
        Person p2 = factory2.create("Park", 21);

        System.out.println("Created Person: " + p1);
        System.out.println("Created Person: " + p2);
    }



}
