package es.esy.sisgrados.mascotas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DIgo on 30/07/2017.
 */

public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotasViewHolder>
{

    ArrayList<Mascotas> mascotas;
    Activity activity;
    public MascotasAdaptador(ArrayList<Mascotas> mascotas,Activity activity){
        this.mascotas=mascotas;
        this.activity=activity;
    }

    @Override
    public MascotasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotasViewHolder MascotasViewHolder, int position) {
        final Mascotas mascota=mascotas.get(position);
        MascotasViewHolder.imgFoto.setImageResource(mascota.getFoto());
        MascotasViewHolder.tvNombreCV.setText(mascota.getNombre());
        MascotasViewHolder.tvNumero.setText(mascota.getRanking());

        MascotasViewHolder.imgFoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(activity,favoritas.class);
                intent.putExtra("nombre",mascota.getNombre());
                activity.startActivity(intent);
            }
        });
        MascotasViewHolder.btn_hueso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(activity, "Diste Like a "+mascota.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {  return mascotas.size(); }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imgFoto;
        private TextView tvNombreCV;
        private ImageButton btn_hueso;
        private TextView tvNumero;

        public MascotasViewHolder(View itemView) {
            super(itemView);
            imgFoto =(ImageView)itemView.findViewById(R.id.imgFoto);
            tvNombreCV=(TextView)itemView.findViewById(R.id.tvNombreCV);
            btn_hueso=(ImageButton)itemView.findViewById(R.id.btn_hueso);
            tvNumero=(TextView)itemView.findViewById(R.id.tvNumero);
        }
    }

}
