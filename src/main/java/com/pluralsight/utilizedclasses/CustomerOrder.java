package com.pluralsight.utilizedclasses;

import com.pluralsight.fooditems.MenuItem;

import java.util.ArrayList;

public class CustomerOrder {

    private final ArrayList<MenuItem> menuItems;

    public CustomerOrder() {
        this.menuItems = new ArrayList<>();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (MenuItem menuItem : menuItems) {
            totalPrice += menuItem.getPrice();
        }
        return totalPrice;
    }

    public int getTotalCalories() {
        int totalCalories = 0;
        for (MenuItem menuItem : menuItems) {
            totalCalories += menuItem.getCalories();
        }
        return totalCalories;
    }

}
