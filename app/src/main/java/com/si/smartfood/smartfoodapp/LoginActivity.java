package com.si.smartfood.smartfoodapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Caio Ribeiro on 08/04/2015.
 */
public class LoginActivity extends Activity
{
    public void onCreate (Bundle savedInstanceState)
    {
       super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_login);
        final Intent Cadastrar = new Intent(this,Cadastrar.class);
        final Intent Entrar = new Intent(this,MenuPrincipal.class);
        Button bt_entrar = (Button) findViewById(R.id.btLogin);
        bt_entrar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                startActivity(Entrar);
            }
        });
       Button bt_cadastrar = (Button) findViewById(R.id.bt_cadastrar);
       bt_cadastrar.setOnClickListener( new View.OnClickListener(){

        public void onClick(View v)
        {
            startActivity(Cadastrar);
        }
    });

    }
  public boolean onCreateOptionsMenu(Menu menu)
  {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.menu_logado, menu);
      return true;
  }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
