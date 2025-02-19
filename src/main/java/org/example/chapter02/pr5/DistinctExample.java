package org.example.chapter02.pr5;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Kim", "Park", "Lee");

        names.stream()
                .distinct()
                .map(name -> "Distinct name: " + name)
                .forEach(System.out::println); // forEach로 반환값이 없고, println도 반환값이 없는 메소드 -> 메서드 참조
    }
}
