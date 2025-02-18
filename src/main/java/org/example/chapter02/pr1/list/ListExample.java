package org.example.chapter02.pr1.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After add: " + fruits);

        String secondFruit = fruits.get(1);
        System.out.println("Second fruit: " + secondFruit);

        fruits.remove(0); // Object를 넣어주면 그걸 제거, 인덱스를 넣어주면 해당 인덱스를 제거
        System.out.println("After remove: " + fruits);

        fruits.remove("Banana");
        System.out.println("After remove: " + fruits);

        System.out.println("List size: " + fruits.size());

        fruits.clear();
        System.out.println("After clear: " + fruits);
    }
}
