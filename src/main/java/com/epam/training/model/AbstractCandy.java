package com.epam.training.model;

import com.epam.training.model.enums.Shape;

import java.util.Objects;

public abstract class AbstractCandy {

    private final double price;
    private final double weight;
    private final Shape shape;

    protected AbstractCandy(double price, double weight, Shape shape) {
        this.price = price;
        this.weight = weight;
        this.shape = shape;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
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
        AbstractCandy that = (AbstractCandy) o;
        return Double.compare(that.price, price) == 0 && Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight);
    }

    @Override
    public String toString() {
        return "AbstractChristmasGIft{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}
