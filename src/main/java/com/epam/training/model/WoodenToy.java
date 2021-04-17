package com.epam.training.model;

import java.util.Objects;

public class WoodenToy extends Toy {

    private boolean isColored;

    public WoodenToy(double price, double weight, String name) {
        super(price, weight, name);
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
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
        WoodenToy woodenToy = (WoodenToy) o;
        return isColored == woodenToy.isColored;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isColored);
    }

    @Override
    public String toString() {
        return "WoodenToy{" +
                "isColored=" + isColored +
                '}';
    }
}
