package es.esy.sisgrados.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Window;

import java.util.ArrayList;

public class favoritas extends AppCompatActivity {
    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);
        Toolbar toolbar;
        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // If your minSdkVersion is 11 or higher, instead use:
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        listaMascotas=(RecyclerView)findViewById(R.id.rvMascotas2);

        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        InicializarListaContacto();
        InicializarAdaptador();
    }

    public void InicializarListaContacto(){

        mascotas=new ArrayList<Mascotas>();
        mascotas.add(new Mascotas("Balto",R.drawable.baltito,"5"));
        mascotas.add(new Mascotas("Firulais",R.drawable.dog_2,"5"));
        mascotas.add(new Mascotas("Doki",R.drawable.dog_4,"5"));
        mascotas.add(new Mascotas("Cira",R.drawable.dog_6,"5"));
        mascotas.add(new Mascotas("Skiper",R.drawable.dog_8,"5"));

    }
    public MascotasAdaptador adaptador;

    public void InicializarAdaptador(){
        adaptador=new MascotasAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }
}
