## HashCode - Equals - ToString

```java
    @Test
    void generatesHashcodeAndEquals() {
        var bmaldant = new Person("bmaldant", 30);
        var bmaldantClone = new Person("bmaldant", 30);
        assertThat(bmaldant).isEqualTo(bmaldantClone);
    }
```

```java
    @Test
    void generatesToString() {
        var anycz = new Person("anycz", 32);
        assertThat(anycz.toString()).isEqualTo("Person[username=anycz, age=32]");
    }
```
