package com.pluralsight.fooditems.sandwich;

import com.pluralsight.fooditems.Calories;
import com.pluralsight.fooditems.enums.SauceType;

public class Sauce extends Calories {

    // Take enum SauceType as attribute
    private final SauceType sauceType;

    // Constructor which sets SauceType and calories value
    public Sauce(SauceType sauceType) {
        this.sauceType = sauceType;
        updateCalories();
    }

    // Getter
    public SauceType getSauceType() {
        return sauceType;
    }

    // Update calorie value based on SauceType with switch statement
    public void updateCalories() {
        this.calories = switch (sauceType) {
            case MAYO -> 50;
            case MUSTARD -> 10;
            case GUACAMOLE -> 150;
            case PESTO -> 200;
            case RANCH -> 120;
            case CAESAR -> 130;
        };
    }

}
