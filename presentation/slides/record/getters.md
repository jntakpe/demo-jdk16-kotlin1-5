## Getters

* No more getX()
* Setters not generated, it's immutable \o/

```java
    @Test
    void accessFields() {
        //New way
        var yhoubeau = new Person("yhoubeau", 25);
        assertThat(yhoubeau.username()).isEqualTo("yhoubeau");
        assertThat(yhoubeau.age()).isEqualTo(25);
        //Old way
        var yhoubeauRegular = new RegularPerson("yhoubeau", 25);
        assertThat(yhoubeauRegular.getUsername()).isEqualTo("yhoubeau");
        assertThat(yhoubeauRegular.getAge()).isEqualTo(25);
    }
```
