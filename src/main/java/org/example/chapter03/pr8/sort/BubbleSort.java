package org.example.chapter03.pr8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,8,9,4,7};
        printArr(arr);
        System.out.println();
        bubbleSort(arr);
        printArr(arr);

        List<Person> list = new ArrayList<>();
        list.add(new Person(30,"성준"));
        list.add(new Person(40,"고기"));
        list.add(new Person(20, "희준"));

        System.out.println(list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(list);

        Collections.sort(list,(o1, o2) -> o2.age - o1.age);


        System.out.println(list);


    }


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
