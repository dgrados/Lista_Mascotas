package es.esy.sisgrados.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listaMascotas=(RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        InicializarListaContacto();
        InicializarAdaptador();
    }
    public MascotasAdaptador adaptador;

    public void InicializarAdaptador(){
        adaptador=new MascotasAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }
    public void InicializarListaContacto(){

        mascotas=new ArrayList<Mascotas>();
        mascotas.add(new Mascotas("Balto",R.drawable.baltito,"5"));
        mascotas.add(new Mascotas("Firulais",R.drawable.dog_2,"5"));
        mascotas.add(new Mascotas("Chiki",R.drawable.dog_3,"4"));
        mascotas.add(new Mascotas("Doki",R.drawable.dog_4,"5"));
        mascotas.add(new Mascotas("Rocky",R.drawable.dog_5,"2"));
        mascotas.add(new Mascotas("Cira",R.drawable.dog_6,"5"));
        mascotas.add(new Mascotas("Peluchin",R.drawable.dog_7,"1"));
        mascotas.add(new Mascotas("Skiper",R.drawable.dog_8,"5"));
        mascotas.add(new Mascotas("Oso",R.drawable.dog_9,"2"));
        mascotas.add(new Mascotas("Kala",R.drawable.dog_10,"3"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openSearch(){
        Intent intent=new Intent(this,favoritas.class);
        startActivity(intent);
    }
    public void openSettings(){
        Intent intent=new Intent(this,favoritas.class);
        startActivity(intent);
    }
}
