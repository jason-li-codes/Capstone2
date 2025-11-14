package com.pluralsight.utilizedclasses;

import java.util.ArrayList;
import java.util.List;

// Class is generic and accepts any type T of Objects
public class FixedArrayList<T> {

    // Private maxSize and ArrayList, with maxSize limiting ArrayList
    private final int maxSize;
    private final ArrayList<T> items;

    // Constructor taking in only maxSize, and then initializes new empty ArrayList
    public FixedArrayList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<T>();
    }

    // Method to add any type item T to FixedList
    public void add(T item) {
        // Since add can only accept one parameter at a time, check if the FixedList is at maxSize
        if (items.size() == maxSize) {
            // If yes, throw newly defined IllegalArgumentException
            throw new IllegalArgumentException("Cannot add item: FixedList is already full.");
        } else {
            // Otherwise, add the item to the ArrayList
            items.add(item);
        }
    }

    // Getter for ArrayList
    public List<T> getItems() {
        return items;
    }

}
