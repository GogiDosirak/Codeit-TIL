package org.example.chapter02.pr1.map;

import java.util.Objects;

public record Score(String scoreId,
                    String name,
                    Integer score) {


    @Override
    public int hashCode() {
        return Objects.hashCode(scoreId);
    }
}
