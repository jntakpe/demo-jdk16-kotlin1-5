## Declaration

```java
sealed interface Shape permits Circle, Rectangle {
    //Circle and Rectangle should be final
}
```

or 

```java
sealed interface Shape {
     record Rectangle(Integer height, Integer width) implements Shape {
    }

    record Circle(Integer radius) implements Shape {
    }
}
```
