package org.example.chapter02.pr3;

import org.example.chapter02.pr2.Calculator;

public class LambdaSyntaxDemo {
    public static void main(String[] args) {
        int c = 100;

        org.example.chapter02.pr2.Calculator add = (a, b) -> a + b + c;

        Calculator substract = (a, b) -> {
            System.out.println("substracting..");
            return a-b;
        };

        System.out.println("3 + 5 = " + add.operate(3,5));
        System.out.println("8 - 2 = " + substract.operate(8, 2));

    }
}
