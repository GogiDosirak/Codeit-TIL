package org.example.chapter03.pr7;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 8, 10, 24};
        System.out.println(binarySearch(intArr, 9));


    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) { // 값을 못찾아 left 값이 right 값을 역전하면 while문 탈출
            int mid = (left + right) / 2; // mid를 계속 바꿔줘야 좁혀진 범위내에서 이진탐색이 또 가능
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else if(arr[mid] > target) {
                right = mid - 1;
            }
        }
        return -1; // 나왔는데도 못찾으면 없는거니까 -1

    }
}
