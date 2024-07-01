package ejercicios_colecciones;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Serie implements Serializable {
    private long serialUID = 1L;

    private String titulo;
    private String genero;
    private int year;
    private List<Actor> reparto;

    public Serie() {
        this.titulo = "";
        this.genero = "";
        this.year = 0;
        this.reparto = new ArrayList<Actor>();
    }
    public Serie(String titulo, String genero, int year) {
        this.titulo = titulo;
        this.genero = genero;
        this.year = year;
        this.reparto = new ArrayList<Actor>();

    }
    public Serie(String titulo, String genero, int year, List<Actor> reparto) {
        this.titulo = titulo;
        this.genero = genero;
        this.year = year;
        this.reparto = reparto;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public List<Actor> getReparto() {
        return reparto;
    }

    public void setReparto(List<Actor> reparto) {
        this.reparto = reparto;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "serialUID=" + serialUID +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", year=" + year +
                ", reparto=" + reparto +
                '}';
    }
}
