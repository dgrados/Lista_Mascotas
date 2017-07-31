package es.esy.sisgrados.mascotas;

/**
 * Created by DIgo on 29/07/2017.
 */

public class Mascotas {
    private int foto;
    private String nombre;
    private int ranking;

    public Mascotas(String nombre, int foto,int ranking) {
        this.nombre = nombre;
        this.foto = foto;
        this.ranking=ranking;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

}
