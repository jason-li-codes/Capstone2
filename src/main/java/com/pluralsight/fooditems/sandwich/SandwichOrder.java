package com.pluralsight.fooditems.sandwich;

import com.pluralsight.FixedArrayList;
import com.pluralsight.fooditems.MenuItem;
import com.pluralsight.fooditems.Size;

public class SandwichOrder implements MenuItem {

    private Bread bread;
    private final FixedArrayList<PremiumToppingMeat> premiumToppingMeats;
    private final FixedArrayList<PremiumToppingCheese> premiumToppingCheeses;
    private final FixedArrayList<RegularTopping> regularToppings;
    private final FixedArrayList<Sauce> sauces;
    private Size size;
    private boolean isToasted;
    private final FixedArrayList<Side> sides;

    public SandwichOrder(Bread bread) {
        this.bread = bread;
        this.premiumToppingMeats = new FixedArrayList<>(2);
        this.premiumToppingCheeses = new FixedArrayList<>(2);
        this.regularToppings = new FixedArrayList<>(5);
        this.sauces = new FixedArrayList<>(3);
        this.isToasted = false;
        this.sides = new FixedArrayList<>(2);
    }

    public Bread getBread() {
        return bread;
    }

    public FixedArrayList<PremiumToppingMeat> getPremiumToppingMeats() {
        return premiumToppingMeats;
    }

    public FixedArrayList<PremiumToppingCheese> getPremiumToppingCheeses() {
        return premiumToppingCheeses;
    }

    public FixedArrayList<RegularTopping> getRegularToppings() {
        return regularToppings;
    }

    public FixedArrayList<Sauce> getSauces() {
        return sauces;
    }

    public Size getSize() {
        return size;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public FixedArrayList<Side> getSides() {
        return sides;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void addMeat(PremiumToppingMeat premiumToppingMeat) {
        try {
            this.premiumToppingMeats.add(premiumToppingMeat);
        } catch (IllegalArgumentException e) {
            System.out.println(premiumToppingMeat + " not added, you may only have up to 2 meats in your sandwich.");
        }
    }

    public void addCheese(PremiumToppingCheese premiumToppingCheese) {
        try {
            this.premiumToppingCheeses.add(premiumToppingCheese);
        } catch (IllegalArgumentException e) {
            System.out.println(premiumToppingCheese + " not added, you may only have up to 2 cheeses in your sandwich.");
        }
    }

    public void addRegularTopping(RegularTopping regularTopping) {
        try {
            this.regularToppings.add(regularTopping);
        } catch (IllegalArgumentException e) {
            System.out.println(regularTopping + " not added, you may only have up to 5 toppings in your sandwich.");
        }
    }

    public void addSauce(Sauce sauce) {
        try {
            this.sauces.add(sauce);
        } catch (IllegalArgumentException e) {
            System.out.println(sauce + " not added, you may only have up to 3 sauces in your sandwich.");
        }
    }

    public void addSide(Side side) {
        try {
            this.sides.add(side);
        } catch (IllegalArgumentException e) {
            System.out.println(side + " not added, you may only have up to 2 sides with your sandwich.");
        }
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getCalories() {

        int totalCal = 0;
        totalCal += bread.getCalories();
        totalCal += premiumToppingMeats.getItems().stream()
                .mapToInt(PremiumToppingMeat::getCalories) // Extract calories from each meat topping
                .sum();
        totalCal += premiumToppingCheeses.getItems().stream()
                .mapToInt(PremiumToppingCheese::getCalories) // Extract calories from each cheese topping
                .sum();
        totalCal += regularToppings.getItems().stream()
                .mapToInt(RegularTopping::getCalories) // Extract calories from each regular topping
                .sum();
        totalCal += sauces.getItems().stream()
                .mapToInt(Sauce::getCalories) // Extract calories from each sauce
                .sum();
        totalCal += sides.getItems().stream()
                .mapToInt(Side::getCalories) // Extract calories from each side
                .sum();

        return totalCal;
    }
}
