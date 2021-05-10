package com.epam.training;

import com.epam.training.model.ChristmasGift;
import com.epam.training.view.ChristmasGiftPrinter;

public class Main {
    public static void main(String[] args) {
        ChristmasGiftCreator giftCreator = new ChristmasGiftCreator();
        ChristmasGift christmasGift = giftCreator.createGifts();

        ChristmasGiftPrinter giftPrinter = new ChristmasGiftPrinter();
        giftPrinter.printGift(christmasGift);
    }
}
