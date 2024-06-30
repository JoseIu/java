package clases_objetos.herencia;

public class HerenciaApp {

    public static void main(String[] args) {
        Madre mother = new Madre();

        Hija daughter = new Hija("Sofia", "Sofiiii",23,"+34 5555555");

        System.out.println(mother);
        mother.setName("Sara");
        System.out.println(mother.getName());
        System.out.println(mother);

        System.out.println("HIJAAAA");
        System.out.println(daughter);

        System.out.println(daughter);
    }

}
