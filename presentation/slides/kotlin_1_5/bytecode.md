## Bytecode inline

```kotlin
@Test
fun inlineByteCode() {
    val regularMail = Mail("toto@mail.com")
    val inlineMail = Email("titi@mail.com")
}
class Mail(val raw: String)
```

```text
 L0
    LINENUMBER 49 L0
    NEW com/soprabanking/demo/kotlin/KotlinTest$Mail
    DUP
    LDC "toto@mail.com"
    INVOKESPECIAL com/soprabanking/demo/kotlin/KotlinTest$Mail.<init> (Ljava/lang/String;)V
    ASTORE 1
   L1
    LINENUMBER 50 L1
    LDC "titi@mail.com"
    INVOKESTATIC com/soprabanking/demo/onepointfive/Email.constructor-impl (Ljava/lang/String;)Ljava/lang/String;
    ASTORE 2
```
