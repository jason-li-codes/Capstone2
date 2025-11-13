package com.pluralsight.fooditems.addons;

import com.pluralsight.fooditems.MenuItem;

public class Chips extends MenuItem {

    private ChipsType chipsType;

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

    public ChipsType getChipsType() {
        return chipsType;
    }
}
