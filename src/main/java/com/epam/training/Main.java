package com.epam.training;

import com.epam.training.model.ChristmasGifts;
import com.epam.training.view.ChristmasGiftPrinter;

public class Main {
    public static void main(String[] args) {
        ChristmasGiftCreator giftCreator = new ChristmasGiftCreator();
        ChristmasGifts christmasGift = giftCreator.createGifts();
        ChristmasGifts specialChristmasGift = giftCreator.createSpecialGifts();

        ChristmasGiftPrinter giftPrinter = new ChristmasGiftPrinter();
        giftPrinter.printGift(christmasGift);
        giftPrinter.printGift(specialChristmasGift);

    }
}
