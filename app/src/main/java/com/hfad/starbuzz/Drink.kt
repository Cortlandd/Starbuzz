package com.hfad.starbuzz


class Drink
// Each Drink is composed of a name, description, and image resource ID
private constructor(val name: String, val description: String, val imageResourceId: Int) {

    companion object {

        // Drink is an array of Drinks
        val drinks = arrayOf(Drink("Latte", "A couple of espresso shots with steamed milk",
                R.drawable.latte), Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                R.drawable.cappuccino), Drink("Filter", "Highest quality beans roasted and brewed fresh",
                R.drawable.filter))
    }

}
