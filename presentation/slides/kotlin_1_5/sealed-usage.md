## Pattern matching in action

```kotlin
    @Test
    fun betterPatternMatching() {
        val shape: Shape = when((0..2).random()) {
            0 -> Rectangle(4.0, 2.0)
            1 -> Square(2.0)
            else -> Circle(2.0)
        }
        val area = when (shape) {
            is Rectangle -> shape.height * shape.width
            is Square -> shape.length.pow(2)
            is Circle -> PI * shape.radius.pow(2)
            //no else needed since sealed class ensure options are exhaustive
        }
        assertThat(area).isIn(4.0, 8.0, PI * 2.0.pow(2))
    }
```
