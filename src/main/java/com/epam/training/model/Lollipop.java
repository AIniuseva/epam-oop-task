package com.epam.training.model;

import com.epam.training.model.enums.Shape;
import com.epam.training.model.enums.Taste;

import java.util.Objects;

public class Lollipop extends Candy {

    private final Taste taste;

    public Lollipop(double price, double weight, Shape shape, Taste taste) {
        super(price, weight, shape);
        this.taste = taste;
    }

    public Taste getTaste() {
        return taste;
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
        Lollipop lollipop = (Lollipop) o;
        return taste == lollipop.taste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taste);
    }

    @Override
    public String toString() {
        return "Lollipop{" +
                "taste=" + taste +
                ", Shape=" + getShape() +
                '}';
    }
}
