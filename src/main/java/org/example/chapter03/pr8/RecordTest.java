package org.example.chapter03.pr8;

import java.util.Objects;

public record RecordTest(int age, String name) {
    // 생성자 재정의
    public RecordTest {
        if (age < 0) {
            throw new IllegalArgumentException("나이가 0보다 적을 수는 없습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RecordTest that)) return false;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
