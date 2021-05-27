package com.soprabanking.demo.record;

import java.util.Objects;

public record Person(String username, Integer age) {

    // Validation
    public Person {
        Objects.requireNonNull(username);
    }

    // Default value
    public Person(String username) {
        this(username, 0);
    }
}
