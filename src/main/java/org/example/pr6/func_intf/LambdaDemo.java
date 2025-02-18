package org.example.pr6.func_intf;

public class LambdaDemo {

    public static void main(String[] args) {
        MyCalculator addAnonymous = new MyCalculator() {
            @Override
            public int operate(int x, int y) {
                return x+y;
            }
        };
        System.out.println("익명 클래스: 3 + 5 = " + addAnonymous.operate(3,5));

        MyCalculator addLambda = (x,y) -> {
            int z = 10 * x + y;
            return z;
        };

        System.out.println("람다: 3 + 5 = " + addLambda.operate(3,5));


    }

}
