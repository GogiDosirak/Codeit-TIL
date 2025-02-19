package org.example.chapter02.pr5;

import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
                List.of("Apple", "Banana"),
                List.of("Cat", "Dog"),
                List.of("Egg")
        );

        nestedList.stream()
                .peek(l -> System.out.println(l))
                .flatMap(l -> l.stream())
                .filter(s -> s.length() > 3)
                .forEach(System.out::println);
    }
}
