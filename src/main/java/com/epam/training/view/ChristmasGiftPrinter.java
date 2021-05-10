package com.epam.training.view;

import com.epam.training.model.AbstractCandy;
import com.epam.training.model.ChristmasGift;

public class ChristmasGiftPrinter {

    public void printGift(ChristmasGift christmasGift) {
        System.out.println("Christmas gift:");
        for (AbstractCandy gift : christmasGift.getGifts()) {
            System.out.println(gift.toString());
        }
    }
}
