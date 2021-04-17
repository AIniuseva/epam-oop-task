package com.epam.training.logic;

import com.epam.training.logic.impl.ChristmasGiftLogicImpl;
import com.epam.training.model.*;
import com.epam.training.model.enums.Shape;
import com.epam.training.model.enums.Taste;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChristmasGiftLogicTest {
    private ChristmasGiftLogic christmasGiftLogic;

    @Before
    public void setup() {
        christmasGiftLogic = new ChristmasGiftLogicImpl();
    }

    @Test
    public void testCalculateGiftsPrice() {
        //when
        double actualPrice = christmasGiftLogic.calculateGiftsPrice(createChristmasGiftsForTests());
        //then
        Assert.assertEquals(57.3, actualPrice, 0);
    }

    @Test
    public void testCalculateGiftsPriceWhenEmpty() {
        //given
        ChristmasGifts christmasGifts = new ChristmasGifts();
        //when
        double actualPrice = christmasGiftLogic.calculateGiftsPrice(christmasGifts);
        //then
        Assert.assertEquals(0, actualPrice, 0);
    }

    @Test
    public void testCalculateGiftsPriceWhenNull() {
        //when
        double actualPrice = christmasGiftLogic.calculateGiftsPrice(null);
        //then
        Assert.assertEquals(0, actualPrice, 0);
    }

    @Test
    public void testCalculateGiftsWeight() {
        //when
        double actualWeight = christmasGiftLogic.calculateGiftsWeight(createChristmasGiftsForTests());
        //then
        Assert.assertEquals(144, actualWeight, 0);
    }

    @Test
    public void testCalculateGiftsWeightWhenEmpty() {
        //given
        ChristmasGifts christmasGifts = new ChristmasGifts();
        //when
        double actualWeight = christmasGiftLogic.calculateGiftsWeight(christmasGifts);
        //then
        Assert.assertEquals(0, actualWeight, 0);
    }

    @Test
    public void testCalculateGiftsWeightWhenNull() {
        //when
        double actualWeight = christmasGiftLogic.calculateGiftsWeight(null);
        //then
        Assert.assertEquals(0, actualWeight, 0);
    }

    private ChristmasGifts createChristmasGiftsForTests() {
        ChristmasGifts christmasGifts = new ChristmasGifts();

        WoodenToy woodenToy = new WoodenToy(20.0, 30.0, "Name");
        christmasGifts.add(woodenToy);
        PlasticToy plasticToy = new PlasticToy(30.0, 80.0, "Name");
        christmasGifts.add(plasticToy);
        Lollipop lollipop = new Lollipop(5.0, 30.0, Shape.ROUND, Taste.LEMON);
        christmasGifts.add(lollipop);
        Chocolate chocolate = new Chocolate(2.3, 4.0, Shape.STAR);
        christmasGifts.add(chocolate);

        return christmasGifts;
    }
}
