package ejercicios_colecciones;

public class Serie {

    private String titulo;
    private String genero;
    private int year;

    public Serie() {
        this.titulo = "";
        this.genero = "";
        this.year = 0;
    }
    public Serie(String titulo, String genero, int year) {
        this.titulo = titulo;
        this.genero = genero;
        this.year = year;
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
}
