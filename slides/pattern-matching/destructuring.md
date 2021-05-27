## Destructuring (not supported yet)

The goal is to be able to do things as follows:

```java
    double area(Shape shape) {
        if (shape instanceof Rectangle(double width, double height))
        return width * height;
        if (shape instanceof Circle(double radius))
        return Math.PI * radius * radius;
        throw new IllegalArgumentException();
    }
```
