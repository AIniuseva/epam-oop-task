package com.epam.training.model;

import com.epam.training.model.enums.Shape;

import java.util.Objects;

public class Chocolate extends Candy {

    private boolean isDark;

    public Chocolate(double price, double weight, Shape shape) {
        super(price, weight, shape);
    }

    public boolean isDark() {
        return isDark;
    }

    public void setDark(boolean dark) {
        isDark = dark;
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
        Chocolate chocolate = (Chocolate) o;
        return isDark == chocolate.isDark;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isDark);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "isDark=" + isDark +
                ", Shape=" + getShape() +
                '}';
    }
}
