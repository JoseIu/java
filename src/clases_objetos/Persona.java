package clases_objetos;

public class Persona {

    public String name;
    public String lastName;
    public  int age;


    public Persona (String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
