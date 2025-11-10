package com.pluralsight.fooditems;

public class Drink implements MenuItem {

    private DrinkType drinkType;
    private Size size;

    public Drink(DrinkType drinkType, Size size) {
        this.drinkType = drinkType;
        this.size = size;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


    @Override
    public double getPrice() {
        return switch (size) {
            case SMALL -> 2;
            case MEDIUM -> 2.50;
            case LARGE -> 3;
        };
    }

    @Override
    public int getCalories() {
        int baseCal = drinkType.getCalories();
        return switch (size) {
            case SMALL -> baseCal;
            case MEDIUM -> baseCal * 2;
            case LARGE -> baseCal * 3;
        };    }
}
