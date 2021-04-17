package com.epam.training;

import com.epam.training.model.*;
import com.epam.training.model.enums.Shape;
import com.epam.training.model.enums.Taste;

public class ChristmasGiftCreator {
    public ChristmasGifts createGifts() {
        ChristmasGifts christmasGifts = new ChristmasGifts();
        WoodenToy woodenHorse = new WoodenToy(10.0, 50.0, "Jacky");
        christmasGifts.add(woodenHorse);

        PlasticToy trainToy = new PlasticToy(20.0, 60.0, "AutoTrain");
        trainToy.setElectrical(true);
        christmasGifts.add(trainToy);

        Lollipop lollipop = new Lollipop(2.0, 2.0, Shape.STAR, Taste.LEMON);
        christmasGifts.add(lollipop);

        Chocolate chocolateCandy = new Chocolate(5.0, 1.0, Shape.SQUARE);
        chocolateCandy.setDark(true);
        christmasGifts.add(chocolateCandy);

        return christmasGifts;
    }
}
