package com.epam.training.model;

import java.util.ArrayList;
import java.util.List;

public class ChristmasGifts {

    private final List<AbstractChristmasGift> gifts = new ArrayList<>();

    public void add(AbstractChristmasGift christmasGift) {
        gifts.add(christmasGift);
    }

    public List<AbstractChristmasGift> getGifts() {
        return gifts;
    }
}
