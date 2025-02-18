package org.example.pr6.inner_class;

public class Outer {
    private int instanceValue;

    public Outer(int instanceValue) {
        this.instanceValue = instanceValue;
    }

    public class Inner {
        public void printInstanceValue() {
            System.out.println(instanceValue);
        }
    }
}
