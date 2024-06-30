package clases_objetos.herencia;

public class Madre {

    private String name;
    private String lastName;
    private int age;


    public Madre(){
        this.name = "";
    }

    public Madre(String name,String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Madre{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
