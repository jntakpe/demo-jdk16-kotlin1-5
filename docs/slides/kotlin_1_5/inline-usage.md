## Inline usage

```kotlin
@Test
fun inlineClasses() {
    //From a performance standpoint Email object is not created
    //From a type safety standpoint Email initialization validations are executed and type is enforced 
    assertThat(catchThrowable { User(Email("jocelyn.ntakpe@soprabanking.com")) }).doesNotThrowAnyException()
    assertThat(catchThrowable { User(Email("jntakpe@gmail.com")) }).isInstanceOf(AssertionError::class.java)
}
```
