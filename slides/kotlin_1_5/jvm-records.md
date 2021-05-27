## JVM records supports

Kotlin declaration:

```kotlin
@JvmRecord
data class Person(val username: String, val age: Int)
```

Call existing Java record from Kotlin code:

```kotlin
    @Test
    fun supportsRecords() {
        val javaPerson = Person("java", 25)
        assertThat(javaPerson.age).isEqualTo(25)
        assertThat(javaPerson.age()).isEqualTo(25)
    }
```
