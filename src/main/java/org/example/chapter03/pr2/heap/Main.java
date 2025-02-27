package org.example.chapter03.pr2.heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks =  new PriorityQueue<>((a, b) -> a.priority - b.priority);

        tasks.add(new Task(10, "Task 1"));
        tasks.add(new Task(5, "Task 2"));
        tasks.add(new Task(15, "Task 3"));
        tasks.add(new Task(3, "Task 4"));
        tasks.add(new Task(7, "Task 5"));

        System.out.println(tasks.poll().name);
        System.out.println(tasks.poll().name);
        System.out.println(tasks.poll().name);
        System.out.println(tasks.poll().name);


    }
}
