## What we do currently

```java
    @Test
    void regular() {
    Shape squareShape = new Square(4);
        if (squareShape instanceof Square) {
            Square square = (Square) squareShape;
            assertThat(square.length()).isNotNull();
        }
    }
```

* We also do that in equals()
