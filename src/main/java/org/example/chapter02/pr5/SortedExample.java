package org.example.chapter02.pr5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,1,8,2,9);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
