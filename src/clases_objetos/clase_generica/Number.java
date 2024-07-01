package clases_objetos.clase_generica;

public class Number <T> {

    private T object;

    public Number(T object) {
        this.object = object;
    }

    public void Imprimir(){
        System.out.println(this.object);
    }
}
