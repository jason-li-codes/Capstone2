package com.pluralsight.fooditems.sandwich;

import com.pluralsight.fooditems.Calories;
import com.pluralsight.fooditems.enums.SideType;

public class Side extends Calories {

    // Take enum SideType as attribute
    private final SideType sideType;

    // Constructor which sets SideType and calories value
    public Side(SideType sideType) {
        this.sideType = sideType;
        updateCalories();
    }

    // Getter
    public SideType getSideType() {
        return sideType;
    }

    // Update calorie value based on SideType with switch statement
    private void updateCalories() {
        this.calories = switch (sideType) {
            case FRIES -> 375;
            case PICKLES -> 20;
        };
    }
}
