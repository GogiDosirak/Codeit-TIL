package org.example.chapter03.pr5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add((new Circle(2.0)));
        shapes.add((new Circle(3.0)));

        printAllShapes(shapes);
        addDefaultShapes(shapes);
    }

    public static void printAllShapes(List<? extends Shape> shapes) {
        // shapes.add(new Circle(1.0)); 은 컴파일 에러 발생 (생산자이기 때문)
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }

    public static void addDefaultShapes(List<? super Shape> list) {
        list.add(new Circle(1.0));
        list.add(new Circle(4.0)); // 추가는 가능하지만,
        list.get(0); // 읽어오는건 불가능
    }
}
