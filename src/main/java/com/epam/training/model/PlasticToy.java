package com.epam.training.model;

import java.util.Objects;

public class PlasticToy extends Toy {

    private boolean isElectrical;

    public PlasticToy(double price, double weight, String name) {
        super(price, weight, name);
    }

    public boolean isElectrical() {
        return isElectrical;
    }

    public void setElectrical(boolean electrical) {
        isElectrical = electrical;
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
        PlasticToy that = (PlasticToy) o;
        return isElectrical == that.isElectrical;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isElectrical);
    }

    @Override
    public String toString() {
        return "PlasticToy{" +
                "isElectric=" + isElectrical +
                '}';
    }
}
