package com.pluralsight.fooditems;

public abstract class MenuItem extends Calories {

    // All MenuItems must have a double attribute called price
    protected double price;

    // Getter
    public double getPrice() {
        return price;
    }

    // All MenuItems must include a toString method which takes in a String title
    public abstract String toString(String title);
}
