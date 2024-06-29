import java.util.Scanner;

public class eje {
    public static void main(String[] args) {

        Scanner keyboard= new Scanner(System.in);

        System.out.println("Ingresa DNI: ");
        String dni = keyboard.nextLine();

        System.out.println("Ingresa EDAD: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Ingresa Nombre: ");
        String name = keyboard.nextLine();


        while ( !dni.equals("0") && !name.equalsIgnoreCase("fin")){

            if(age >=6 && age <=10){
                System.out.println("Grupo Menores A: ");
            }else if(age >=11 && age <=17){
                System.out.println("Grupo Menores B: ");
            }else if(age >=18 && age <=30){
                System.out.println("Grupo Adultos: ");
            }else if(age >=31 && age <=50){
                System.out.println("Grupo Adultos: ");
            }else {
                System.out.println("Grupo Adultos Mayores: ");
            }

            System.out.println("Ingresa DNI: ");
            dni = keyboard.nextLine();

            System.out.println("Ingresa EDAD: ");
            age = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println("Ingresa Nombre: ");
            name = keyboard.nextLine();

        }

    }
}
