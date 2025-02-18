package org.example.chapter02.pr2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterNumbersExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        Stream<Integer> stream = numbers.stream(); // 스트림 객체 생성

        // 1. 직접 구현
        Stream<Integer> evenStream1 = stream.filter(new EvenIntegerPredicate());
        evenStream1.forEach(num -> System.out.println(num));

        // 2. 익명 클래스로 구현
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };
        Stream<Integer> stream2 = numbers.stream();
        Stream<Integer> evenStream2 = stream2.filter(predicate); // 중간 연산은 이 때 실행되는 것이 아니라,
        evenStream2.forEach(num -> { // 최종 연산이 호출될 때 중간 연산(filter)가 실행됨 (지연 평가) why? 최종 연산에 필요없는 연산을 건너뛸 수 있음
            System.out.println(num);
        });

        // 3. 람다표현식으로 구현
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.println(num));


        Stream<Integer> stream3 = numbers.stream();
        Stream<Integer> evenStream = stream3.filter(new EvenIntegerPredicate());
        // 스트림 중간 연산 결과를 반환받고, 다시 중간연산
        Stream<Integer> overTenStream = evenStream.filter(
                new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer value) {
                        return value > 10;
                    }
                }
        );
        Stream<Integer> overTwentyStream = overTenStream.filter(value -> value > 20);
        overTwentyStream.forEach(num -> {
            System.out.println(num);
        });

    }
}
