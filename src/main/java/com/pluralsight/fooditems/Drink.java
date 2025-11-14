package com.pluralsight.fooditems;

import com.pluralsight.fooditems.enums.DrinkType;
import com.pluralsight.fooditems.enums.Size;

public class Drink extends MenuItem {

    // Take enums DrinkType and Size as attributes
    private DrinkType drinkType;
    private Size size;

    // Constructor which sets DrinkType, calories, and price value
    public Drink(DrinkType drinkType, Size size) {
        this.drinkType = drinkType;
        this.size = size;
        updateCalories();
        updatePrice();
    }

    // Getters and setters
    public DrinkType getDrinkType() {
        return drinkType;
    }

    public Size getSize() {
        return size;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
        updateCalories();
    }

    public void setSize(Size size) {
        this.size = size;
        updateCalories();
        updatePrice();
    }

    // Update price of Drink by going through switch case
    public void updatePrice() {
        this.price = switch (size) {
            case SMALL -> 2;
            case MEDIUM -> 2.50;
            case LARGE -> 3;
        };
    }

    // Update calories of Drink by going through all attributes with switch cases
    public void updateCalories() {
        this.calories = switch (drinkType) {
            case KO_KUH -> 100;
            case SPRY_TUH -> 90;
            case PEP_UH_SEE -> 98;
            case DOK_TUH_PEP_UH -> 96;
            case MONS_TUH -> 95;
        } * switch (size) {
            case SMALL -> 1;
            case MEDIUM -> 2;
            case LARGE -> 3;
        };
    }

    // Overidden toString method for cleaner formatting
    @Override
    public String toString(String title) {
        return title + "\n" +
                "=====================================\n" +
                // Add Order Information
                String.format("Size: %s\n", getSize().name()) +
                String.format("Brand: %s\n", getDrinkType().name().replace("_", "-")) +
                // Add Price and Calories
                "=====================================\n" +
                String.format("Price: $%.2f\n", getPrice()) +
                String.format("Calories: %d\n", getCalories()) +
                // Add Footer
                "=====================================\n";
    }
}
