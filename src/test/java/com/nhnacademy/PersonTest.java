package com.nhnacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void getName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(""));
    }
}