package com.pluralsight.fooditems;

public abstract class MenuItem extends Calories {

    protected double price;

    public double getPrice() {
        return price;
    }

    public abstract String toString(String title);
}
