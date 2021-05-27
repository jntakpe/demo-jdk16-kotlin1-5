## Type patterns

```java
    @Test
    void patternMatching() {
        Shape squareShape = new Square(4);
        if (squareShape instanceof Square square) {
            assertThat(square.length()).isNotNull();
        }
    }
```

```java
    @Test
    void patternMatchingImproved() {
            Shape squareShape = new Square(4);
            if (squareShape instanceof Square square && square.length() > 2) {
            assertThat(square.length()).isGreaterThan(2);
        }
    }
```

* Note that null checks are included meaning that `squareShape` won't match if null
