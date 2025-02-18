package org.example.chapter02.pr1.practice;

import java.util.*;

public class StudentManager {
    private List<Student> students;
    private Set<String> studentNames; // 학생들 이름이 중복되는지 확인용
    private Map<String, Integer> scoreMap; // 점수 저장

    public StudentManager() {
        students = new ArrayList<>();
        studentNames = new HashSet<>();
        scoreMap = new HashMap<>();
    }

    // 새로운 학생 등록
    public void addStudent(Student student, int score) {
        if (studentNames.contains(student.getName())) {
            System.out.println("[Error] 이미 존재하는 학생 이름입니다.");
            return;
        }
        students.add(student);
        studentNames.add(student.getName());
        scoreMap.put(student.getName(), score);

        System.out.println("[Info] 새로운 학생이 등록되었습니다: " + student);
    }

    // 학생 제거
    public void removeStudent(String name) {
        Student target = null;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                target = s;
                break;
            }
        }

        // if-else보다 Early termination 방식으로 짜는게 더 좋음!
        // if(target != null) {
   // } else
    //{ 학생없어
    // }
        // 이거보단
        if (target == null) {
            System.out.println("[Error] 해당 이름의 학생을 찾을 수 없습니다.");
            return;
        }
        students.remove(target);
        studentNames.remove(name);
        scoreMap.remove(name);
        System.out.println("[Info] 학생이 삭제되었습니다.: " + name);
    }

    // 학생 출력
    public void printAllStudents() {
        System.out.println("=== 학생 목록 ===");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // 점수 출력
    public void printScore(String name) {
        Integer score = scoreMap.get(name);
        if (score == null) {
            System.out.println("[Error] 점수를 찾을 수 없습니다.");
            return;
        }
        System.out.println("[Info] " + name + "의 점수 : " + score);
    }
}
