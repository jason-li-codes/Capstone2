package com.pluralsight.fooditems.sandwich;

import com.pluralsight.fooditems.enums.MeatType;

public class PremiumToppingMeat extends SandwichFilling {

    // Take enum MeatType as attribute
    private MeatType meatType;

    // Constructor to set the calories value for each premium cheese topping
    public PremiumToppingMeat(MeatType meatType, boolean isExtra) {
        this.meatType = meatType;
        this.isExtra = isExtra;
        updateCalories();
    }

    // Getter and setter
    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    // Update calorie value based on MeatType with switch statement
    public void updateCalories() {
        this.calories = switch (meatType) {
            case TURKEY -> 120;
            case HAM -> 100;
            case CHICKEN -> 150;
            case ROAST_BEEF -> 200;
            case PASTRAMI -> 250;
            case BACON -> 300;
        };
    }
}
