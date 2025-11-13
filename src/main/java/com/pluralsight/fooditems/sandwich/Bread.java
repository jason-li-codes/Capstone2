package com.pluralsight.fooditems.sandwich;

import com.pluralsight.fooditems.Calories;
import com.pluralsight.fooditems.sandwich.swtypes.BreadType;

public class Bread extends Calories {

    private BreadType breadType;

    public Bread(BreadType breadType) {
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
