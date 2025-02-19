package org.example.chapter02.pr1.map;



import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 95);

        System.out.println("After put: " + scores);

        scores.put("Lee", 88);
        System.out.println("After updating 'Lee': " + scores);

        Integer parkScore = scores.get("Park");
        System.out.println("Park's score: " + parkScore);

        Integer noneScore = scores.get("Ha");
        System.out.println("Ha's score: " + noneScore);

        Integer defaultScore = scores.getOrDefault("Ha", 0);
        System.out.println("Default score: " + defaultScore);

        System.out.println("Contains 'Kim'? " + scores.containsKey("Kim"));

        scores.remove("Kim");

        System.out.println(scores.keySet());






    }
}
