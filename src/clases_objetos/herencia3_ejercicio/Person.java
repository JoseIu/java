package clases_objetos.herencia3_ejercicio;

public class Person{
    private String name;


    public Person(){
        this.name = "";
    }
    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
