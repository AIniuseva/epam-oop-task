package com.epam.training.model;

import java.util.Objects;

public class Toy extends AbstractChristmasGift {

    private final String name;

    public Toy(double price, double weight, String name) {
        super(price, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Toy toy = (Toy) o;
        return Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
