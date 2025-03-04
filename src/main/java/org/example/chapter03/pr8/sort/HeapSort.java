package org.example.chapter03.pr8.sort;

import java.util.PriorityQueue;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + " ");
        }
    }

}
