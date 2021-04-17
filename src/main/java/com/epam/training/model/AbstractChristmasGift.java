package com.epam.training.model;

import java.util.Objects;

public abstract class AbstractChristmasGift {

    private final double price;
    private final double weight;

    protected AbstractChristmasGift(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractChristmasGift that = (AbstractChristmasGift) o;
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
