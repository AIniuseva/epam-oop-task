package com.epam.training.model;

import java.util.ArrayList;
import java.util.List;

public class ChristmasGift {

    private final List<AbstractCandy> gifts = new ArrayList<>();

    public void add(AbstractCandy christmasGift) {
        gifts.add(christmasGift);
    }

    public List<AbstractCandy> getGifts() {
        return gifts;
    }
}
