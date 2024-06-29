import java.util.Scanner;

public class exercise02 {

    public static void main(String[] args) {
        String names[] = new String[8];
        Scanner keyBoard = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Ingresar nombre: " + i);
            names[i] = keyBoard.nextLine();

        }


        for (int i = 0; i < names.length; i++) {

            System.out.println("Nombre: " + names[i] + " En la posición " + i);
        }
    }
}
