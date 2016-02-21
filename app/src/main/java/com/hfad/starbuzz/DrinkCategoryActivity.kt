package com.hfad.starbuzz

import android.app.ListActivity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class DrinkCategoryActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // The array contains Drink (from drink class) objects
        val listAdapter = ArrayAdapter(
                // this current activity. Activity class is a subclass of context
                this,
                /* Built in layout resource. Tells the array adapter
                to display each item in the array in a single text view */
                android.R.layout.simple_list_item_1,
                // the array in Drink
                Drink.drinks)
        // Attach array adapter to the list view.
        val listView = listView
        listView.adapter = listAdapter
    }

    // Implement the onListItemClick() method so that DrinkActivity is launched when the user
    // clicks on an item in the list view.
    public override fun onListItemClick(listView: ListView, itemView: View, position: Int, id: Long) {
        val intent = Intent(this@DrinkCategoryActivity, DrinkActivity::class.java)
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, id.toInt())
        startActivity(intent)
    }

}
