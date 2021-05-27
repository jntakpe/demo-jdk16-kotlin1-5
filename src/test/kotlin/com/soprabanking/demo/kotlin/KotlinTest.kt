package com.soprabanking.demo.kotlin

import com.soprabanking.demo.onepointfive.Circle
import com.soprabanking.demo.onepointfive.Email
import com.soprabanking.demo.onepointfive.Rectangle
import com.soprabanking.demo.onepointfive.Shape
import com.soprabanking.demo.onepointfive.Square
import com.soprabanking.demo.onepointfive.User
import com.soprabanking.demo.record.Person
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.catchThrowable
import org.junit.jupiter.api.Test
import kotlin.math.PI
import kotlin.math.pow

class KotlinTest {

    @Test
    fun supportsRecords() {
        val javaPerson = Person("java", 25)
        assertThat(javaPerson.age).isEqualTo(25)
        assertThat(javaPerson.age()).isEqualTo(25)
    }

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

    @Test
    fun inlineClasses() {
        //From a performance standpoint Email object is not created
        //From a type safety standpoint Email initialization validations are executed and type is enforced
        assertThat(catchThrowable { User(Email("jocelyn.ntakpe@soprabanking.com")) }).doesNotThrowAnyException()
        assertThat(catchThrowable { User(Email("jntakpe@gmail.com")) }).isInstanceOf(AssertionError::class.java)
    }

    @Test
    fun inlineByteCode() {
        val regularMail = Mail("toto@mail.com")
        val inlineMail = Email("titi@mail.com")
    }

    class Mail(val raw: String)

}
