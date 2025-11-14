package com.pluralsight.fooditems;

import com.pluralsight.fooditems.enums.ChipsType;

public class Chips extends MenuItem {

    // Take enum ChipsType as attribute
    private final ChipsType chipsType;

    // Constructor which sets ChipsType, calories, and price value
    public Chips(ChipsType chipsType) {
        this.chipsType = chipsType;
        this.calories = switch (chipsType) {
            case PO_TAY_TOHZ -> 150;
            case FREE_TOHZ -> 160;
            case TOASTY_TOHZ, DORY_TOHZ -> 140;
            case TAKI_TOHZ -> 155;
        };
        this.price = 1.50;
    }

    // Getter
    public ChipsType getChipsType() {
        return chipsType;
    }

    // Overidden toString method for cleaner formatting
    @Override
    public String toString(String title) {
        return title + "\n" +
                "=====================================\n" +
                // Add Order Information
                String.format("Brand: %s\n", getChipsType().name().replace("_", "-")) +
                // Add Price and Calories
                "=====================================\n" +
                String.format("Price: $%.2f\n", getPrice()) +
                String.format("Calories: %d\n", getCalories()) +
                // Add Footer
                "=====================================\n";
    }
}
