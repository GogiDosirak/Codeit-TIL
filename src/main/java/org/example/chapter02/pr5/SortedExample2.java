package org.example.chapter02.pr5;

import java.util.List;

public class SortedExample2 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("kim", 30),
                new Person("yang", 25),
                new Person("park", 40),
                new Person("jun", 52),
                new Person("ha", 35)
        );

        people.stream().sorted().forEach(System.out::println);
    }
}
