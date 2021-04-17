package com.epam.training.logic.impl;

import com.epam.training.logic.ChristmasGiftLogic;
import com.epam.training.model.AbstractChristmasGift;
import com.epam.training.model.ChristmasGifts;

public class ChristmasGiftLogicImpl implements ChristmasGiftLogic {
    @Override
    public double calculateGiftsPrice(ChristmasGifts christmasGift) {
        double totalPrice = 0;

        for (AbstractChristmasGift gift : christmasGift.getGifts()) {
            totalPrice += gift.getPrice();
        }
        return totalPrice;
    }

    @Override
    public double calculateGiftsWeight(ChristmasGifts christmasGift) {
        double totalWeight = 0;

        for (AbstractChristmasGift gift : christmasGift.getGifts()) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}
