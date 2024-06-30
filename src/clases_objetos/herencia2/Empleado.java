package clases_objetos.herencia2;

public class Empleado extends  Persona{
    private int salary;

    public Empleado(){
        super();
        this.salary = 1200;
    }
    public Empleado(String name, int salary){
        super(name);
        this.salary = salary;
    }
}
