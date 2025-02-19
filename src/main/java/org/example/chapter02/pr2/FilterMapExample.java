package org.example.chapter02.pr2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim",90);
        scores.put("Lee", 75);
        scores.put("Park", 88);
        scores.put("Kim", 100);

        // Map은 Stream으로 뽑아지면 Map.Entry 형태로 반환됨
        // entry라는 객체는 Map과 달리, hashMap에 대한 key-value 쌍을 하나의 객체로 갖고 있어 getKey(), getValue() 메서드로 key와 value에 바로 접근할 수 있도록 해준다.
        // Map의 경우 Key로만 value 접근 가능
        Predicate<Map.Entry<String, Integer>> highScore = new Predicate<Map.Entry<String, Integer>>() {
            @Override
            public boolean test(Map.Entry<String, Integer> entry) {
                return entry.getValue() >= 80;
            }
        };

        // Map은 Stream을 사용할 수 없음. entrySet으로 바꿔서 사용 가능
        // Why? Map은 Key-Value로 저장된 2차원 테이블 구조이며, Collection 인터페이스를 구현하지 않음, Map.entrySet으로 key-value를 값으로 가지는 일차원 객체로 변환 후 Stream (또는 Map.keySet, Map.values())
        scores.entrySet().stream()
                .filter(entry -> entry.getValue() >= 80)
                .forEach(entry -> {
                    System.out.println("High scorer: " + entry.getKey() +" => " + entry.getValue());
                });

        Map<String, Integer> filteredScores = scores.entrySet().stream()
                .filter(entry -> entry.getValue() >= 80)
                .collect(Collectors.toMap(entry -> entry.getKey(),
                        entry -> entry.getValue()));

        System.out.println(filteredScores);



    }
}
