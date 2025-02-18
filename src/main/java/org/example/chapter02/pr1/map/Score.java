package org.example.chapter02.pr1.map;

import java.util.Objects;

public record Score(String scoreId,
                    String name,
                    Integer score) {

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Score score)) return false; // 먼저 Score 타입 객체인지 비교
        return Objects.equals(scoreId, score.scoreId); // 그후, scoreId를 비교
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(scoreId);
    }
}
