package com.epam.training.logic.impl;

import com.epam.training.logic.ChristmasGiftLogic;
import com.epam.training.model.AbstractCandy;
import com.epam.training.model.ChristmasGift;

public class ChristmasGiftLogicImpl implements ChristmasGiftLogic {
    @Override
    public double calculatePrice(ChristmasGift christmasGift) {
        double totalPrice = 0;
        if (christmasGift != null) {
            for (AbstractCandy gift : christmasGift.getGifts()) {
                totalPrice += gift.getPrice();
            }
        }

        return totalPrice;
    }

    @Override
    public double calculateWeight(ChristmasGift christmasGift) {
        double totalWeight = 0;
        if (christmasGift != null) {
            for (AbstractCandy gift : christmasGift.getGifts()) {
                totalWeight += gift.getWeight();
            }
        }

        return totalWeight;
    }
}
