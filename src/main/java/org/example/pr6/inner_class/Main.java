package org.example.pr6.inner_class;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer(10);
        Outer.Inner inner = outer.new Inner();
        inner.printInstanceValue();

        Outer outer2 = new Outer(-100);
        Outer.Inner inner2 = outer2.new Inner();
        inner2.printInstanceValue();
    }
}
