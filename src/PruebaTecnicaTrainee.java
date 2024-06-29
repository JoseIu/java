import java.util.Scanner;

public class PruebaTecnicaTrainee {

    public static void main(String[] args) {
        char ocupied = 'X';
        char available = 'L';

        char [][] seats = new char[10][10];

        for (int f = 0; f < seats.length; f++) {
            for (int c = 0; c < seats.length; c++) {

                seats[f][c] = available;
            }
        }

        Scanner keyboard = new Scanner(System.in);
        boolean exit = true;
        String isExiting;
        int row,seat;

        System.out.println("longitud:" + seats.length);
        while (exit != false){

            System.out.println("Qué fila?");
            row = keyboard.nextInt();
            System.out.println("Qué asiento?");
            seat = keyboard.nextInt();
            keyboard.nextLine();

            if(row > seats.length || seat > seats.length || row < 0 || seat < 0){
                System.out.println("Fila o asiento fuera de los límites. Intente de nuevo.");
                continue;
            }

            if(seats[row][seat] == available){
                System.out.println("Asiento reservado correctamente 🚀");
                seats[row][seat] = ocupied;
            }else {
                System.out.println("Asiento ocupado 😥,PRUEBA CON OTRO!");

            }
            System.out.println("Desea continua? S o N");
            isExiting = keyboard.nextLine();

            if(isExiting.equalsIgnoreCase("N")){
                exit = false;

            }


        }

    }
}
