package org.example.chapter02.pr2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        // MapEntry를 받아서 String으로 변환
        Function<Map.Entry<String, Integer>, String> entryToString =
                new Function<Map.Entry<String, Integer>, String>() {
                    @Override
                    public String apply(Map.Entry<String, Integer> entry) {
                        return entry.getKey() + ": " + entry.getValue();
                        // "Kim : 90"
                    }
                };

        scores.entrySet().stream()
                .map(entryToString)
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });
        // 이게 forEach(s -> System.out.println(s)) 와 같은 것
        // Consumer 타입은 Return값이 없으므로 요소가 소비됨



    }
}
