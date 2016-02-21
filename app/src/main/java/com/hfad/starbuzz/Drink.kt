package com.hfad.starbuzz


class Drink// each drink has a name, description, and image resource
private constructor(// Each Drink is composed of a name, description, and image resource ID
        val name: String, // getters
        val description: String, val imageResourceId: Int) {

    override fun toString(): String {
        return this.name
    }

    companion object {

        // Drink is an array of Drinks
        val drinks = arrayOf(Drink("Latte", "A couple of espresso shots with steamed milk",
                R.drawable.latte), Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                R.drawable.cappuccino), Drink("Filter", "Highest quality beans roasted and brewed fresh",
                R.drawable.filter))
    }
}
