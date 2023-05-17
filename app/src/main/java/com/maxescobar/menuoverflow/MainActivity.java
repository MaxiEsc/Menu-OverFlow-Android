package com.maxescobar.menuoverflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView ivFoto;

    //Para agregar el action bar tocar el archivo AndroidManifest

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivFoto = (ImageView) findViewById(R.id.ivTipo);
    }

    //Metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    //Metodo para el item
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.item_1){
            Toast.makeText(this,R.string.musica,Toast.LENGTH_SHORT).show();
            ivFoto.setImageResource(R.drawable.portada4);
        }
        if (id == R.id.item_2){
            Toast.makeText(this,R.string.paisaje, Toast.LENGTH_SHORT).show();
            ivFoto.setImageResource(R.drawable.arbol2);
        }
        return super.onOptionsItemSelected(item);
    }
}