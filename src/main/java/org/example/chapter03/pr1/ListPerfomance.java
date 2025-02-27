package org.example.chapter03.pr1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerfomance {
    public static void main(String[] args) {
        int dataSize = 1000000;

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        testList1(arrayList, dataSize);
        testList1(linkedList, dataSize);

        testList2(arrayList, 100);
        testList2(linkedList, 100);

        testList3(arrayList, 1000);
        testList3(linkedList, 1000);
    }

    // 순차 삽입 (뒤쪽에만 삽입) - ArrayList가 좀 더 빠름
    public static void testList1(List<Integer> list, int dataSize) {
        long start = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            list.add(i);
        }

        long end = System.nanoTime();
        System.out.println("testList1: " + (end - start) + "ns");
    }

    // 중간 요소 삽입 - LinkedList가 훨씬 빠르다
    public static void testList2(List<Integer> list, int insertSize) {
        long start = System.nanoTime();
        for (int i = 0; i < insertSize; i++) {
            list.add(i, i); // i번 인덱스에 i추가
        }
        long end = System.nanoTime();
        System.out.println("testList2: " + (end - start) + "ns");
    }

    // 임의 요소 접근 - ArrayList가 훨씬 빠르다
    public static void testList3(List<Integer> list, int accesCount) {
        long start = System.nanoTime();
        for (int i = 0; i < accesCount; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(list.size()); // 0부터 list.size 사이에서 랜덤 생성
            list.get(randomNumber);
        }
        long end = System.nanoTime();
        System.out.println("testList3: " + (end - start) + "ns");
    }
}
