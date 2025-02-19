package org.example.chapter02.pr4;

@FunctionalInterface
public interface PersonFactory {
    Person create(String name, int age);
}
