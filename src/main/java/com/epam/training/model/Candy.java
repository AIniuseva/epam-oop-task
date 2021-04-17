package com.epam.training.model;

import com.epam.training.model.enums.Shape;

import java.util.Objects;

public class Candy extends AbstractChristmasGift {

    private final Shape shape;

    public Candy(double price, double weight, Shape shape) {
        super(price, weight);
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
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
        Candy candy = (Candy) o;
        return shape == candy.shape;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shape);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "shape=" + shape +
                '}';
    }
}
