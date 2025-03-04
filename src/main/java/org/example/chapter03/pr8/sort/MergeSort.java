package org.example.chapter03.pr8.sort;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right); // 왼쪽 오른쪽에 대해 mergeSort 진행 후
            merge(arr, left, mid, right); // 합쳐줌
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        int[] leftArr = new int[sizeLeft];
        int[] rightArr = new int[sizeRight]; // 추가적인 공간 할당

        for (int i = 0; i < sizeLeft; i++) {
            leftArr[i] = arr[left+i]; // 배열 복사
        }

        for (int j = 0; j < sizeRight; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < sizeLeft && j < sizeRight) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        // 남은 요소 처리
        while (i < sizeLeft) {
            arr[k++] = leftArr[i++];
        }
        while (j < sizeRight) {
            arr[k++] = rightArr[j++];
        }
    }

}
