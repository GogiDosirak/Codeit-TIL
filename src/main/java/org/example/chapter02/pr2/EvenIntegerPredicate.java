package org.example.chapter02.pr2;

import java.util.function.Predicate;

public class EvenIntegerPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }
}
