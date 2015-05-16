package com.si.smartfood.smartfoodapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent Welcome = new Intent(this,WelcomeActivity.class);
        final Intent Login = new Intent(this,LoginActivity.class);
        //Exibir botões
        Button bt_welcome = (Button) findViewById((R.id.bt_welcome));
        Button bt_login = (Button) findViewById((R.id.bt_login));
        bt_welcome.setOnClickListener(new View.OnClickListener()
        {
              public void onClick(View view)
            {
                 Toast.makeText(getBaseContext(),"Hello stranger", Toast.LENGTH_SHORT).show();
                 startActivity(Welcome);
         //     startActivity(Intent.createChooser(I, "escolha uma aplicação"));
            }
        });
        bt_login.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                startActivity(Login);
                //     startActivity(Intent.createChooser(I, "escolha uma aplicação"));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
