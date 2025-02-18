package org.example.pr6.static_nested_class;

public class Outer {
    private static int staticValue = 100;
    private int instanceValue = 200;

    public static class StaticNested {
        public void printValues() {
            System.out.println("Outer.staticValue: " + staticValue);
            Outer outer = new Outer();
            System.out.println(outer.instanceValue); // 외부 클래스의 인스턴스 멤버에 접근하기 위해선 Outer 인스턴스 참조 필요
            // why? 인스턴스 멤버는 클래스 공통이 참조하는 것이 아닌, 인스턴스가 생성될 때 가지는 값이기 때문
        }
    }
}
