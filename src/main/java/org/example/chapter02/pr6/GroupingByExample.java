package org.example.chapter02.pr6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Kim",
                "Lee",
                "park",
                "Kang",
                "Choi",
                "Cha"
        );

        // 이름의 첫 글자를 기준으로 그룹화
        Map<String, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(
                                name -> String.valueOf(name.charAt(0))
                        )
                );

        System.out.println(grouped);

    }
}
