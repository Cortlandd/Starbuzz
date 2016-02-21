package com.hfad.starbuzz

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DrinkActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        // Get the drink from the intent
        val drinkNo = intent.extras.get(EXTRA_DRINKNO) as Int
        // Using drinkNo to get the details of the drink the user chose
        val drink = Drink.drinks[drinkNo]

        /* Populate the drink image section */
        val photo = findViewById(R.id.photo) as ImageView
        // Set the source of the image using setImageResource()
        photo.setImageResource(drink.imageResourceId)
        // Needed to make the app more accessible. (whatever the fuck that means)
        photo.contentDescription = drink.name

        /* Populate the drink name section */
        val name = findViewById(R.id.name) as TextView
        // Used to set the text from drink inside a textView
        name.text = drink.name

        /* Populate the drink description section */
        val description = findViewById(R.id.description) as TextView
        // Used to set the text from drink inside a textView
        description.text = drink.description
    }

    companion object {

        /* Constant */
        val EXTRA_DRINKNO = "drinkNo"
    }
}
