package com.epam.training.view;

import com.epam.training.model.AbstractChristmasGift;
import com.epam.training.model.ChristmasGifts;

public class ChristmasGiftPrinter {

    public void printGift(ChristmasGifts christmasGift) {
        System.out.println("Christmas gift:");
        for (AbstractChristmasGift gift : christmasGift.getGifts()) {
            System.out.println(gift.toString());
        }
    }
}
