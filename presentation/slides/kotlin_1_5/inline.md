## Inline classes

Performance of primitive types without loosing type safety

```kotlin
@JvmInline
value class Email(val raw: String) {
    init {
        assert(raw.endsWith("@soprabanking.com") || raw.endsWith("@soprasteria.com"))
    }
}
```

Note that mutable var are not allowed in inline classes
