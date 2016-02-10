package com.hfad.starbuzz;

/**
 * Created by cortl on 2/7/2016.
 */
public class Drink {
    // Each Drink is composed of a name, description, and image resource ID
    private String name;
    private String description;
    private int imageResourceId;

    // Drink is an array of Drinks
    public static final Drink[] drinks = {
        new Drink("Latte", "A couple of espresso shots with steamed milk",
                R.drawable.latte),
        new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                R.drawable.cappuccino),
        new Drink("Filter", "Highest quality beans roasted and brewed fresh",
                R.drawable.filter)
    };

    // each drink has a name, description, and image resource
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    // getters
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
