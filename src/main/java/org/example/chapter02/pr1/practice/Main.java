package org.example.chapter02.pr1.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\\n=== 메뉴 ===");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 보기");
            System.out.println("4. 학생 점수 조회");
            System.out.println("5. 종료");
            System.out.print("선택: ");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("이름 입력: ");
                    String name = sc.nextLine();
                    System.out.print("나이 입력: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("점수 입력: ");
                    int score = sc.nextInt();
                    sc.nextLine();

                    Student newStudent = new Student(name, age);
                    studentManager.addStudent(newStudent, score);
                    break;

                case 2:
                    System.out.print("삭제할 학생 이름 입력: ");
                    String delName = sc.nextLine();
                    studentManager.removeStudent(delName);
                    break;

                case 3:
                    studentManager.printAllStudents();

                case 4:
                    System.out.print("조회할 학생 이름 입력: ");
                    String searchName = sc.nextLine();
                    studentManager.printScore(searchName);
                    break;

                case 5:
                    run = false;
                    System.out.println("[Info] 프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("[Error] 잘못된 입력입니다.");
            }
        }
        sc.close();
    }

}
