package facci.yandrizambrano.parcial;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class secundaria2 extends AppCompatActivity {
    RecyclerView listado;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria2);


        listado = findViewById(R.id.listado);

        //coleccion de datos
        List<Comida> comidas = Comida.listAll(Comida.class);
        comidas.forEach((item)-> Log.e("test",item.getNombre()));

        //layout
        listado.setLayoutManager(new LinearLayoutManager( this));

        //adaptador

        Adaptador adaptador = new Adaptador(comidas);
        listado.setAdapter(adaptador);

    }




}