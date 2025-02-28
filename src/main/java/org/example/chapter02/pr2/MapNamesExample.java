package org.example.chapter02.pr2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Chalie"); // 배열을 리스트로 변환하는 메서드로 add없이 한번에 초기화 가능

        Function<String, Integer> nameLengthMapper = new Function<String, Integer>() {
            @Override
            public Integer apply(String name) {
                return name.length();
            }
        };

        names.stream()
                .map(nameLengthMapper)
                .forEach(length -> {
                    System.out.println("Name length: " + length);
                });

        List<Integer> nameList = names.stream()
                .map(name -> name.length())
                .toList(); // String을 Integer로 변환한 걸 List로 반환

        nameList.add(5);

        System.out.println(nameList);


    }
}
