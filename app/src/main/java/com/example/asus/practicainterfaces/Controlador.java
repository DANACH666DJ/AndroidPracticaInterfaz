package com.example.asus.practicainterfaces;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by asus on 30/11/2016.
 */

public class Controlador implements View.OnClickListener,View.OnFocusChangeListener{
    MainActivity vista;




    Controlador(MainActivity vista){
        this.vista=vista;
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==vista.btnCambiarImagen.getId()){
            vista.imagen.setImageResource(R.drawable.logo);
        }else if(view.getId()==vista.btnOcultar.getId()){
            vista.imagen.setVisibility(view.INVISIBLE);
        }else if(view.getId()==vista.btnCambiarTexto.getId()){
            vista.cabecera.setText("Hola mundo");
        }else if(view.getId()==vista.btnFinalizar.getId()){
            Context context = vista.getApplicationContext();
            CharSequence text = "Adios!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            System.exit(0);
        }else if(view.getId()==vista.btnCambiarColor.getId()){
            vista.layout.setBackgroundColor(Color.parseColor("#990000"));

        }



    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }



}
