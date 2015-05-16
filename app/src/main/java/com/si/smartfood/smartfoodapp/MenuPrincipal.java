package com.si.smartfood.smartfoodapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MenuPrincipal extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_principal);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Intent intent = new Intent(null, VerPerfil.class);
        intent.addCategory(Intent.CATEGORY_ALTERNATIVE);

        // Search and populate the menu with acceptable offering applications.
        menu.addIntentOptions(
                R.id.intent_group,  // Menu group to which new items will be added
                0,      // Unique item ID (none)
                0,      // Order for the items (none)
                this.getComponentName(),   // The current activity name
                null,   // Specific items to place first (none)
                intent, // Intent created above that describes our requirements
                0,      // Additional flags to control items (none)
                null);  // Array of MenuItems that correlate to specific items (none)

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
