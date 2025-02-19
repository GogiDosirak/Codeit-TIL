package org.example.chapter02.pr3;

public class LambdaCaptureDemo {
    private String memberField = "Outer field";

    public void testLambda() {
        String localVar = "Local variable";

        // 람다식
        Runnable r = () -> {
            memberField = "Changed";
            System.out.println("멤버 변수: " + memberField);
            System.out.println("로컬 변수: " + localVar);
        };
        r.run();
    }

    public static void main(String[] args) {
        new LambdaCaptureDemo().testLambda(); // testLambda가 메서드 밖에서 실행
    }
}
