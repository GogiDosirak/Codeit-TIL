package org.example.chapter02.pr4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InstanceMethodReferenceDemo {

    // Consumer<T> 인터페이스는 T 타입의 객체를 매개변수로 받고, 반환값이 없는 accept(T t) 메서드
    // 해당 메서드는 Consumer<String>과 형태가 같다.
    public void printString(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        // 멤버 메소드기 때문에 객체화를 시켜서 참조 가능
        InstanceMethodReferenceDemo demo = new InstanceMethodReferenceDemo();

        List<String> list = Arrays.asList("apple", "banana", "orange");
        Consumer<String> consumer = demo::printString; // String을 받고 반환값이 없으므로 Consumer 클래스가 해당 메소드 참조 가능
        list.forEach(consumer);
        consumer.accept("haha");



    }



}
