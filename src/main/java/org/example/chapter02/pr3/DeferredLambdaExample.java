package org.example.chapter02.pr3;

public class DeferredLambdaExample {
    public static void main(String[] args) {
        Runnable r = createRunnable();
        r.run();
        // 람다의 실행이 메소드를 벗어나서 다른 곳에서 실행될 수 있음 - capture 덕분에 메서드가 종료돼도 람다가 실행 가능
        // 실행은 여기서 됨, 람다 정의가 일어난 메서드가 끝났는데 어떻게 지역 변수 localVar를 가지고 잘 실행될까 ? -> Capture를 이용
    }


    public static Runnable createRunnable() {
        String localVar = "Hello, I'm a local variable!";

        Runnable r = () -> {
            System.out.println(localVar);
        };

        return r;
        // 람다의 정의가 일어나고 돌려줌
        // return () -> {
        //    System.out.println(localVar);
        // };
        // 이것과 같음

    }
}
