package com.pluralsight.fooditems;

public enum Chips implements MenuItem {

    PO_TAY_TOHZ(150),
    FREE_TOHZ(160),
    TOASTY_TOHZ(140),
    TAKI_TOHZ(155),
    DORY_TOHZ(140);

    private final int calories;

    Chips(int calories) {
        this.calories = calories;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
