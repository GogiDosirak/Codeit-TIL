package org.example.chapter02.pr4;

import java.util.function.BiFunction;
import java.util.function.Function;

public class StaticMethodRefDemo {
    public static int doubleValue(int x) {
        return x * 2;
    }

    public static int calculate(int x, int y) {
        return x + y - 3;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return StaticMethodRefDemo.doubleValue(integer * 2);
            }
        };
        Function<Integer, Integer> f2 = (num) -> StaticMethodRefDemo.doubleValue(num);
        Function<Integer, Integer> f3 = StaticMethodRefDemo::doubleValue; // :: 문법
        BiFunction<Integer, Integer, Integer> f4 = StaticMethodRefDemo::calculate;

        // static 메서드를 람다식 매개변수로 넘겨줄 수 있음 (new Function이 아니라) 왜? 둘다 Integer를 받아서 Integer를 반환하는 형태이기 때문

        System.out.println(f2.apply(5));
        System.out.println(f3.apply(5));
        System.out.println(f4.apply(3,5));

    }
}
