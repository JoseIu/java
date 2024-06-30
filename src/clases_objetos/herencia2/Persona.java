package clases_objetos.herencia2;

public class Persona {
    private  String name;

    public Persona(){
        this.name = "";
    }

    public Persona(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
