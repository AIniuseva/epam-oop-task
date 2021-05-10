package com.epam.training;

import com.epam.training.model.Chocolate;
import com.epam.training.model.ChristmasGift;
import com.epam.training.model.Lollipop;
import com.epam.training.model.enums.Shape;
import com.epam.training.model.enums.Taste;

public class ChristmasGiftCreator {

    public ChristmasGift createGifts() {
        ChristmasGift christmasGifts = new ChristmasGift();

        Chocolate roundChocolate = new Chocolate(20.3, 30.1, Shape.ROUND);
        roundChocolate.setDark(true);
        christmasGifts.add(roundChocolate);
        Chocolate squareChocolate = new Chocolate(20.3, 30.1, Shape.SQUARE);
        christmasGifts.add(squareChocolate);
        Chocolate starChocolate = new Chocolate(20.3, 30.1, Shape.STAR);
        christmasGifts.add(starChocolate);

        Lollipop orangeLollipop = new Lollipop(30.5, 20.7, Shape.SQUARE, Taste.ORANGE);
        christmasGifts.add(orangeLollipop);
        Lollipop strawberryLollipop = new Lollipop(30.5, 20.7, Shape.SQUARE, Taste.STRAWBERRY);
        christmasGifts.add(strawberryLollipop);
        Lollipop lemonLollipop = new Lollipop(30.5, 20.7, Shape.SQUARE, Taste.LEMON);
        christmasGifts.add(lemonLollipop);
        Lollipop appleLollipop = new Lollipop(30.5, 20.7, Shape.SQUARE, Taste.APPLE);
        christmasGifts.add(appleLollipop);

        return christmasGifts;
    }
}
