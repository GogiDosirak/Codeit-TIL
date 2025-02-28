package org.example.chapter03.pr6;

import java.io.*;

public class BufferedReaderWriterDemo {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) { // Reader 객체를 Buffered로 감싼다고 생각하면 됨
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello, world!");
            bw.newLine(); // 줄바꿈 안해주면 붙어서 나옴
            bw.write("Hello, Code it");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
