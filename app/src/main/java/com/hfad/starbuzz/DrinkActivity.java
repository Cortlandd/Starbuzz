package com.hfad.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    /* Constant */
    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // Get the drink from the intent
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        // Using drinkNo to get the details of the drink the user chose
        Drink drink = Drink.drinks[drinkNo];

        /* Populate the drink image section */
        ImageView photo = (ImageView) findViewById(R.id.photo);
        // Set the source of the image using setImageResource()
        photo.setImageResource(drink.getImageResourceId());
        // Needed to make the app more accessible. (whatever the fuck that means)
        photo.setContentDescription(drink.getName());

        /* Populate the drink name section */
        TextView name = (TextView) findViewById(R.id.name);
        // Used to set the text from drink inside a textView
        name.setText(drink.getName());

        /* Populate the drink description section */
        TextView description = (TextView) findViewById(R.id.description);
        // Used to set the text from drink inside a textView
        description.setText(drink.getDescription());
    }
}
