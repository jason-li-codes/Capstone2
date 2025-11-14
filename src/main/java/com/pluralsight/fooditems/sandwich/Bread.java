package com.pluralsight.fooditems.sandwich;

import com.pluralsight.fooditems.Calories;
import com.pluralsight.fooditems.enums.BreadType;

public class Bread extends Calories {

    private BreadType breadType;

    public Bread(BreadType breadType) {
        this.breadType = breadType;
        this.calories = switch (breadType) {
            case WHITE -> 100;
            case MULTIGRAIN -> 90;
            case WHEAT -> 80;
            case RYE -> 85;
        };
    }

    public BreadType getBreadType() {
        return breadType;
    }
}
