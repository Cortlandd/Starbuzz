## Rebuilt in Kotlin-Lang.
# Was getting error:
> ava.lang.RuntimeException: Unable to instantiate activity ComponentInfo{com.hfad.starbuzz/com.hfad.starbuzz.TopLevelActivity}: java.lang.ClassNotFoundException: Didn't find class "com.hfad.starbuzz.TopLevelActivity" on path: DexPathList[[zip file "/data/app/com.hfad.starbuzz-4.apk"],nativeLibraryDirectories=[/data/app-lib/com.hfad.starbuzz-4, /vendor/lib, /system/lib]]

# Fix (it was 'src/main/kotlin')
> inside grade:
> sourceSets {
>
>  main.java.srcDirs += 'src/main/java'
>
>}

## What happens when you run the app

1. ***When the user starts the app, it launches TopLevelActivity.***

> Device -> TopLevelActivity

2. ***DeviceThe onCreate() method in TopLevelActivity creates an onItemClickListener and links it to the activity’s ListView.***
> TopLevelActivity -> ListView -> onItemClickListener

3. ***When the user clicks on an item in the list view, the onItemClickListener’s onItemClick() method gets called.***

   If the Drinks item was clicked, the onItemClickListener creates an intent to start DrinkCategoryActivity.

> ListView -> onItemClick -> onItemClickListener -> Intent -> DrinkCategoryActivity

4. ***DrinkCategoryActivty is a ListActivity***

   The DrinkCategoryActivity list view uses an ArrayAdapter<Drink> to display a list of drink names.
> DrinkActivity -> ListView -> ArrayAdapter<Drink> -> Drink.drinks

5. ***When the user chooses a drink from the ListView, the onListItemClick() method gets called.***
> ListView -> OnListItemClick() -> DrinkCategoryActivity

6. ***The DrinkCategoryActivity’s onListItemClick() method creates an intent to start DrinkActivity, passing along the drink number as extra information.***
> DrinkCAtegoryActivity -> Intent ; drinkNo = 0 -> DrinkActivity

7. ***DrinkActivity is launched.***

   It retrieves the drink number from the intent, and gets details for the correct drink from the Drink class. It uses this information to update its views.
> DrinkActivity -> drinks[0] -> Drink (drink[0] is latte. Return information on Latte) -> Latte (name, description, ImageResourceId) -> DrinkActivity