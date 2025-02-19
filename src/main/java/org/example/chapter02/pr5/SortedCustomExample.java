package org.example.chapter02.pr5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedCustomExample {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Seoul", "Busan", "New York", "London");

        // String 기본 정렬은 맨 첫번째 글자 오름차순
        cities.stream().
                sorted().
                forEach(System.out::println);

        // 문자열 길이로 정렬 커스텀
        cities.stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length() - o2.length(); // 오름차순
                    }
                }.reversed()) // reversed 붙여주면 내림차순
                .forEach(System.out::println);
        // 또는
        cities.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);
    }
}
