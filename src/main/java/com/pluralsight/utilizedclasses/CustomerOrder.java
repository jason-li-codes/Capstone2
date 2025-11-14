package com.pluralsight.utilizedclasses;

import com.pluralsight.fooditems.MenuItem;

import java.util.ArrayList;

public class CustomerOrder {

    // Has ArrayList of MenuItems as attribute
    private final ArrayList<MenuItem> menuItems;

    // Parameterless constructor initializes empty ArrayList
    public CustomerOrder() {
        this.menuItems = new ArrayList<>();
    }

    // Getter
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Get totalPrice by using forEach method and summing up individual prices
    public double getTotalPrice() {
        double totalPrice = 0;
        for (MenuItem menuItem : menuItems) {
            totalPrice += menuItem.getPrice();
        }
        return totalPrice;
    }

    // Get totalCalories by using forEach method and summing up individual prices
    public int getTotalCalories() {
        int totalCalories = 0;
        for (MenuItem menuItem : menuItems) {
            totalCalories += menuItem.getCalories();
        }
        return totalCalories;
    }

}
