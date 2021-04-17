package com.epam.training;

import com.epam.training.model.*;
import com.epam.training.model.enums.Shape;
import com.epam.training.model.enums.Taste;

public class ChristmasGiftCreator {

    private ChristmasGifts christmasGifts;

    public ChristmasGifts createGifts() {
        christmasGifts = new ChristmasGifts();
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

    public ChristmasGifts createSpecialGifts() {
        christmasGifts = new ChristmasGifts();

        Toy softToy = new Toy(10.0, 40.0, "WinnieThePooh");
        christmasGifts.add(softToy);

        WoodenToy woodenCar = new WoodenToy(7.5, 50.0, "Lewis");
        woodenCar.setColored(true);
        christmasGifts.add(woodenCar);

        PlasticToy fireEngineToy = new PlasticToy(30.0, 60.0, "Firefighters");
        fireEngineToy.setElectrical(true);
        christmasGifts.add(fireEngineToy);

        Lollipop lollipop = new Lollipop(2.0, 2.0, Shape.ROUND, Taste.ORANGE);
        christmasGifts.add(lollipop);

        Lollipop lollipop1 = new Lollipop(2.0, 2.0, Shape.STAR, Taste.LEMON);
        christmasGifts.add(lollipop1);

        Lollipop lollipop2 = new Lollipop(2.0, 2.0, Shape.SQUARE, Taste.STRAWBERRY);
        christmasGifts.add(lollipop2);

        Chocolate chocolateCandy = new Chocolate(3.0, 1.0, Shape.ROUND);
        chocolateCandy.setDark(true);
        christmasGifts.add(chocolateCandy);

        Chocolate chocolateCandy1 = new Chocolate(3.0, 1.0, Shape.SQUARE);
        christmasGifts.add(chocolateCandy1);

        return christmasGifts;
    }
}
