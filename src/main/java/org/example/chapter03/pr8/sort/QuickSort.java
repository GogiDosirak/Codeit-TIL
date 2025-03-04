package org.example.chapter03.pr8.sort;

public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) { // 주어진 배열을 왼쪽, 오른쪽으로 나눔
        if (left >= right) return; // 뒤집히면 정렬이 끝남

        int pivotIndex = partition(arr, left, right); // partition 함수로 pivot 정해주기
        quickSort(arr, left, pivotIndex -1);
        quickSort(arr, pivotIndex + 1, right);

    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // 주어진 배열의 가장 오른쪽을 피벗으로 선택
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i = 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }

}
