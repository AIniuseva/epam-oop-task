package com.epam.training.logic;

import com.epam.training.model.ChristmasGift;

public interface ChristmasGiftLogic {

    double calculatePrice(ChristmasGift christmasGift);

    double calculateWeight(ChristmasGift christmasGift);

}
