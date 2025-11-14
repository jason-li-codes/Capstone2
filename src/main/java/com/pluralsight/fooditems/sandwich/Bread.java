package com.pluralsight.fooditems.sandwich;

import com.pluralsight.fooditems.Calories;
import com.pluralsight.fooditems.enums.BreadType;

public class Bread extends Calories {

    // Take enum BreadType as attribute
    private final BreadType breadType;

    // Constructor which sets BreadType and calories value
    public Bread(BreadType breadType) {
        this.breadType = breadType;
        this.calories = switch (breadType) {
            case WHITE -> 100;
            case MULTIGRAIN -> 90;
            case WHEAT -> 80;
            case RYE -> 85;
        };
    }

    // getter for BreadType
    public BreadType getBreadType() {
        return breadType;
    }
}
