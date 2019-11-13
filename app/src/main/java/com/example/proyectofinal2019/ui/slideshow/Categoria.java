package com.example.proyectofinal2019.ui.slideshow;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinal2019.R;

public class Categoria extends AppCompatActivity {

    private EditText nombreCategoria,comentarioCategoria;
    private Button btnGuardarCategoria;

    String senal = "";
    String Nombre= "";
    String Comentario = "";

    boolean NombreCategoria = false;
    boolean ComentarioCategoria = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        nombreCategoria = (EditText)findViewById(R.id.nombreCategoria);
        comentarioCategoria = (EditText)findViewById(R.id.comentarioCategoria);

        btnGuardarCategoria = (Button)findViewById(R.id.btnGuardarCategoria);

        try {
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            if (bundle != null) {

                senal = bundle.getString("senal");
                Nombre = bundle.getString("nombre");
                Comentario = bundle.getString("comentario");
                if (senal.equals("1")) {
                    nombreCategoria.setText(Nombre);
                    comentarioCategoria.setText(Comentario);
                    //finish();
                }
            }
        }catch (Exception e){

        }


    }
}
