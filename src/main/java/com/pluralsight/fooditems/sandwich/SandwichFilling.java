package com.pluralsight.fooditems.sandwich;

import com.pluralsight.fooditems.Calories;

public abstract class SandwichFilling extends Calories {

    // all SandwichFilling must include a boolean isExtra
    protected boolean isExtra;

    // all SandwichFilling must include getter and setter for said boolean
    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean isExtra) {
        this.isExtra = isExtra;
    }
}