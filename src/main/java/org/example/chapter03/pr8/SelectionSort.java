package org.example.chapter03.pr8;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,2,9,4,8};

        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }


    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
    }
}
