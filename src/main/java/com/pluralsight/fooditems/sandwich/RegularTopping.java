package com.pluralsight.fooditems.sandwich;

import com.pluralsight.fooditems.enums.RegularToppingType;

public class RegularTopping extends SandwichFilling {

    private RegularToppingType regularToppingType;

    // Constructor to set the calories value for each regular topping
    RegularTopping(RegularToppingType regularToppingType, boolean isExtra) {
        this.regularToppingType = regularToppingType;
        this.isExtra = isExtra;
        updateCalories();
    }

    public RegularToppingType getRegularToppingType() {
        return regularToppingType;
    }

    public void setRegularToppingType(RegularToppingType regularToppingType) {
        this.regularToppingType = regularToppingType;
    }

    public void updateCalories() {
        this.calories = switch (regularToppingType) {
            case LETTUCE -> 5;
            case TOMATO -> 10;
            case ONION -> 8;
            case PEPPERS -> 7;
            case JALAPENOS -> 6;
            case PICKLES -> 9;
            case OLIVES -> 15;
            case SPINACH -> 11;
            case MUSHROOMS -> 12;
        };

    }
}
