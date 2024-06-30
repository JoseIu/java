package clases_objetos.herencia2;

public class App {
    public static void main(String[] args) {
        Persona person = new Persona();
        System.out.println(person);

        Empleado employee = new Empleado("Jose", 1400);
        System.out.println(employee);

    }
}
