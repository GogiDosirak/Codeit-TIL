package org.example.chapter02.pr5;

import java.util.Comparator;
import java.util.List;

public class SortedCustomExample2 {

    public static class PersonCustomComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.age % 10, o2.age % 10);
        }
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("kim", 30),
                new Person("yang", 25),
                new Person("park", 40),
                new Person("jun", 52),
                new Person("ha", 34)
        );

        people.stream()
                .sorted(new PersonCustomComparator().reversed())
                .forEach((System.out::println));



    }

}
