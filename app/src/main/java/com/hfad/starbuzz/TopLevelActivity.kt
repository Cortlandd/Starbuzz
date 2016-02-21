package com.hfad.starbuzz

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class TopLevelActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_level)

        // Create an OnItemClickListener
        val itemClickListener = AdapterView.OnItemClickListener { listView, v, position, id ->
            /*
            * These are the same arguments that the onItemClick() method above has: the list
            * view, the item view that was clicked, its position in the list, and the row ID
            * of the underlying data.
            */
            if (position == 0) {
                val intent = Intent(this@TopLevelActivity, DrinkCategoryActivity::class.java)
                startActivity(intent)
            }
        }

        // Add the listener to the list view
        val listView = findViewById(R.id.list_options) as ListView
        listView.onItemClickListener = itemClickListener
    }
}

