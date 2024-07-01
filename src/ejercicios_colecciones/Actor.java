package ejercicios_colecciones;

import java.io.Serializable;

public class Actor implements Serializable {
    private long serialUID = 1L;

    private String nombre ;
    private String generoFavorito;
    private int yearExperiencia;


    public Actor() {
        this.nombre = "";
        this.generoFavorito = "";
        this.yearExperiencia = 0;
    }
    public Actor(String nombre, String generoFavorito, int yearExperiencia) {
        this.nombre = nombre;
        this.generoFavorito = generoFavorito;
        this.yearExperiencia = yearExperiencia;
    }

    public long getSerialUID() {
        return serialUID;
    }
    public void setSerialUID(long serialUID) {
        this.serialUID = serialUID;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }
    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    public int getYearExperiencia() {
        return yearExperiencia;
    }
    public void setYearExperiencia(int yearExperiencia) {
        this.yearExperiencia = yearExperiencia;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "serialUID=" + serialUID +
                ", nombre='" + nombre + '\'' +
                ", generoFavorito='" + generoFavorito + '\'' +
                ", yearExperiencia=" + yearExperiencia +
                '}';
    }
}
