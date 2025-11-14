package com.pluralsight.fooditems.sandwich;

import com.pluralsight.fooditems.enums.CheeseType;

public class PremiumToppingCheese extends SandwichFilling {

    // Take enum CheeseType as attribute
    private CheeseType cheeseType;

    // Constructor which takes CheeseType and boolean
    public PremiumToppingCheese(CheeseType cheeseType, boolean isExtra) {
        this.cheeseType = cheeseType;
        this.isExtra = isExtra;
        updateCalories();
    }

    // Getter and setter
    public CheeseType getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(CheeseType cheeseType) {
        this.cheeseType = cheeseType;
        updateCalories();
    }

    // Update calorie value based on CheeseType with switch statement
    public void updateCalories() {
        this.calories = switch (cheeseType) {
            case AMERICAN -> 75;
            case SWISS -> 100;
            case CHEDDAR -> 110;
            case PROVOLONE -> 90;
        };
    }
}
