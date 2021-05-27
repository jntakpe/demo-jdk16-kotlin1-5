package com.soprabanking.demo.record;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    void createRecord() {
        var jntakpe = new Person("jntakpe", 22);
        assertThat(jntakpe).isNotNull();
    }

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

    @Test
    void generatesHashcodeAndEquals() {
        var bmaldant = new Person("bmaldant", 30);
        var bmaldantClone = new Person("bmaldant", 30);
        assertThat(bmaldant).isEqualTo(bmaldantClone);
    }

    @Test
    void generatesToString() {
        var anycz = new Person("anycz", 32);
        assertThat(anycz.toString()).isEqualTo("Person[username=anycz, age=32]");
    }

}
