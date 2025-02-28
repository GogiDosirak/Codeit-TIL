package org.example.chapter03.pr6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt");
            int data;
            while((data = fr.read()) != -1) { // 마지막 문자를 읽었을 떄 -1 리턴, 즉, 끝날때까지 계속 읽음
                System.out.println((char) data); // 한글자씩 출력된다 (스트림)
            }
        } catch (IOException e) { // 명시적으로 처리해줘야함. 안해주면 컴파일 에러 발생
            e.printStackTrace();
        }

        // try 문 안에 File/IO 객체를 선언하고 할당해주면, try 구문이 끝날 때, 자바에서 fr.close()로 자동적으로 객체를 닫아줌. -> 직접 안닫아도 된다! / 안닫히면 파일 스트림 객체가 계속 참조된 상태로 남아있음 -> 메모리 낭비

        try (FileWriter fw = new FileWriter("output.txt")){
            String content = "Hellom World!!";
            for (char c : content.toCharArray()) {
                fw.write(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
