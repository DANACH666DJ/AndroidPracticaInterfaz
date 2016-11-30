package com.example.asus.practicainterfaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btnCambiarImagen;
    public Button btnCambiarColor;
    public Button btnOcultar;
    public Button btnEliminar;
    public Button btnCambiarTexto;
    public Button btnMostrar;
    public Button btnFinalizar;
    public ImageView imagen;
    public TextView cabecera;
    public RelativeLayout layout;

    public Controlador controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlador=new Controlador(this);

        btnCambiarImagen=(Button)this.findViewById(R.id.buttonImg);
        btnCambiarColor=(Button)this.findViewById(R.id.buttonColor);
        btnOcultar=(Button)this.findViewById(R.id.buttonOcultar);
        btnEliminar=(Button)this.findViewById(R.id.buttonEliminar);
        btnCambiarTexto=(Button)this.findViewById(R.id.buttonCambiarTexto);
        btnMostrar=(Button)this.findViewById(R.id.buttonMostrar);
        btnFinalizar=(Button)this.findViewById(R.id.buttonFinalizar);
        imagen=(ImageView) this.findViewById(R.id.imageView);
        cabecera=(TextView)this.findViewById(R.id.cabecera);
        layout=(RelativeLayout) this.findViewById(R.id.activity_main);



        btnCambiarImagen.setOnClickListener(controlador);
        btnCambiarColor.setOnClickListener(controlador);
        btnOcultar.setOnClickListener(controlador);
        btnEliminar.setOnClickListener(controlador);
        btnCambiarTexto.setOnClickListener(controlador);
        btnMostrar.setOnClickListener(controlador);
        btnFinalizar.setOnClickListener(controlador);
        imagen.setOnClickListener(controlador);
        cabecera.setOnClickListener(controlador);
        layout.setOnClickListener(controlador);





    }
}
