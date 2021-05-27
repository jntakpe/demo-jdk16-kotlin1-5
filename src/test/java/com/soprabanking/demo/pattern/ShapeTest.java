package com.soprabanking.demo.pattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeTest {

    @Test
    void regular() {
        Shape squareShape = new Square(4);
        if (squareShape instanceof Square) {
            Square square = (Square) squareShape;
            assertThat(square.length()).isNotNull();
        }
    }

    @Test
    void patternMatching() {
        Shape squareShape = new Square(4);
        if (squareShape instanceof Square square) {
            assertThat(square.length()).isNotNull();
        }
    }

    @Test
    void patternMatchingImproved() {
        Shape squareShape = new Square(4);
        if (squareShape instanceof Square square && square.length() > 2) {
            assertThat(square.length()).isGreaterThan(2);
        }
    }
}
