package org.example.chapter03.pr6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MapToTextDemo {
    public static void main(String[] args) {
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("banana", 20);
        stockMap.put("cherry", 30);

        // saveInFile(stockMap, "stock.txt");
        Map<String, Integer> loadedMap = loadFromFile("stock.txt");
        System.out.println(loadedMap);

        String numberText = "20";
        double doubleNumber = 20.0;
    }

    // Map을 파일로 저장
    public static void saveInFile(Map<String, Integer> stockMap, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) { // Entry로 Map의 Entry 셋에 접근 가능 -> key와 value값 동시에 사용 가능!
                bw.write(entry.getKey() + ":" + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 파일을 맵으로 전환
    public static Map<String, Integer> loadFromFile(String fileName) {
        Map<String, Integer> result = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(":"); // String에서 :를 기준으로 key와 value를 찾아냄
                String key = tokens[0];
                int value = Integer.parseInt(tokens[1]); // 텍스트를 읽어서 의미있는 구조로 변환하는 걸 "파싱"이라 함
                result.put(key, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
