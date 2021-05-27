package com.soprabanking.demo.onepointfive

@JvmInline
value class Email(val raw: String) {
    init {
        assert(raw.endsWith("@soprabanking.com") || raw.endsWith("@soprasteria.com"))
    }
}
