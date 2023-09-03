package com.nhnacademy;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class Person {
    private String name;

    @NotNull
    public Person(@NotNull String name) {
        if (name.isEmpty() || Objects.isNull(name)) {
            throw new IllegalArgumentException("Name is Empty");
        } else {
            this.name = name;
        }
    }
}
