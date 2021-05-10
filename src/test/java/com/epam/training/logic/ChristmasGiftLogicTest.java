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
        double actualPrice = christmasGiftLogic.calculatePrice(createChristmasGiftsForTests());
        //then
        Assert.assertEquals(57.3, actualPrice, 0);
    }

    @Test
    public void testCalculateGiftsPriceWhenEmpty() {
        //given
        ChristmasGift christmasGifts = new ChristmasGift();
        //when
        double actualPrice = christmasGiftLogic.calculatePrice(christmasGifts);
        //then
        Assert.assertEquals(0, actualPrice, 0);
    }

    @Test
    public void testCalculateGiftsPriceWhenNull() {
        //when
        double actualPrice = christmasGiftLogic.calculatePrice(null);
        //then
        Assert.assertEquals(0, actualPrice, 0);
    }

    @Test
    public void testCalculateGiftsWeight() {
        //when
        double actualWeight = christmasGiftLogic.calculateWeight(createChristmasGiftsForTests());
        //then
        Assert.assertEquals(144, actualWeight, 0);
    }

    @Test
    public void testCalculateGiftsWeightWhenEmpty() {
        //given
        ChristmasGift christmasGifts = new ChristmasGift();
        //when
        double actualWeight = christmasGiftLogic.calculateWeight(christmasGifts);
        //then
        Assert.assertEquals(0, actualWeight, 0);
    }

    @Test
    public void testCalculateGiftsWeightWhenNull() {
        //when
        double actualWeight = christmasGiftLogic.calculateWeight(null);
        //then
        Assert.assertEquals(0, actualWeight, 0);
    }

    private ChristmasGift createChristmasGiftsForTests() {
        ChristmasGift christmasGifts = new ChristmasGift();

        Lollipop lemonLollipop = new Lollipop(20.0, 30.0, Shape.ROUND, Taste.LEMON);
        christmasGifts.add(lemonLollipop);
        Lollipop appleLollipop = new Lollipop(5.0, 30.0, Shape.ROUND, Taste.APPLE);
        christmasGifts.add(appleLollipop);

        Chocolate starChocolate = new Chocolate(30.0, 80.0, Shape.STAR);
        christmasGifts.add(starChocolate);
        Chocolate roundChocolate = new Chocolate(2.3, 4.0, Shape.ROUND);
        christmasGifts.add(roundChocolate);

        return christmasGifts;
    }
}
