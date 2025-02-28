package org.example.chapter03.pr6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListToTextDemo {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "cherry");
        //listToText(items, "items.txt");

        List<String> loadItems = textToList("items.txt");
        System.out.println(loadItems);


    }
    // 파일을 List 객체로 변환
    public static List<String> textToList(String fileName) {
        List<String> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                items.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return items;
    }

    // List 객체를 파일로 변환
    public static void listToText(List<String> items, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("items.txt"))) {
            for (String item : items) {
                bw.write(item);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
