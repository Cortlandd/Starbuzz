package com.hfad.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // The array contains Drink (from drink class) objects
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink> (
                // this current activity. Activity class is a subclass of context
                this,
                /* Built in layout resource. Tells the array adapter
                to display each item in the array in a single text view */
                android.R.layout.simple_list_item_1,
                // the array in Drink
                Drink.drinks);
        // Attach array adapter to the list view.
        ListView listView = getListView();
        listView.setAdapter(listAdapter);
    }

    // Implement the onListItemClick() method so that DrinkActivity is launched when the user
    // clicks on an item in the list view.
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }

}
