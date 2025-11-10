package com.pluralsight.fooditems;

public enum DrinkType implements Calories {

    KO_KUH(100),
    SPRY_TUH(90),
    PEP_UH_SEE(98),
    DOK_TUH_PEP_UH(96),
    MONS_TUH(95);

    private final int calories;

    DrinkType(int calories) {
        this.calories = calories;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
