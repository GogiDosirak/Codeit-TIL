package org.example.pr6.anonymous_class;

public class AnonymousClass {

    private final String someString = "hello";

    public void test() {

        System.out.println(this.someString);

        EventListener listener = new EventListener() {
            private final String someString = "world";
            @Override
            public void oneEvent(String eventData) {
                System.out.println("이벤트 발생: " + eventData);
                System.out.println(this.someString);
                System.out.println(AnonymousClass.this.someString);
            }
        };

        listener.oneEvent("event 1");
    }
}
