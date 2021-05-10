package com.epam.training.logic;

import com.epam.training.model.ChristmasGift;

public interface ChristmasGiftLogic {

    public double calculatePrice(ChristmasGift christmasGift);

    public double calculateWeight(ChristmasGift christmasGift);

}
