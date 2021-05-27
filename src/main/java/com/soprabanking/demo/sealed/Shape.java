package com.soprabanking.demo.sealed;

public sealed interface Shape {

    record Rectangle(Integer height, Integer width) implements Shape {

    }

    record Circle(Integer radius) implements Shape {

    }
}
