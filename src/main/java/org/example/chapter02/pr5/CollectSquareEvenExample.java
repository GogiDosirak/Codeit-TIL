package org.example.chapter02.pr5;

import java.util.List;
import java.util.stream.Collectors;

public class CollectSquareEvenExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 4, 5, 10, 2);

        List<Integer> process = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(process);

    }
}
