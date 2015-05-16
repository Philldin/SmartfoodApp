package com.si.smartfood.smartfoodapp.util;

import android.app.Activity;
import android.content.Intent;

import com.si.smartfood.smartfoodapp.Cadastrar;
import com.si.smartfood.smartfoodapp.MainActivity;
import com.si.smartfood.smartfoodapp.MenuPrincipal;
import com.si.smartfood.smartfoodapp.VerPerfil;

/**
 * Created by Caio Ribeiro on 03/05/2015.
 */
public class TrataMenu extends Activity
{
    final Intent Intent1 = (new Intent(this,Cadastrar.class));
    final Intent Intent2 = (new Intent(this,VerPerfil.class));
    final Intent Intent3 = (new Intent(this,MenuPrincipal.class));
    final Intent Intent4 = (new Intent(this,MainActivity.class));
   public TrataMenu(int id)
    {


        switch (id)
        {
            case 1:  startActivity(Intent1);
            case 2:  startActivity(Intent2);
            case 3:  startActivity(Intent3);
            case 4:  startActivity(Intent4);
            case 5:  finish();
            case 2131296344:  startActivity(Intent1);
            case 2131296345:  startActivity(Intent2);
            case 2131296346:  startActivity(Intent3);
            case 2131296347:  startActivity(Intent4);
            //case 2131296348:  finish();
        }

    }


}
