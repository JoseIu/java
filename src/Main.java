import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double notes[][]= new double[4][4];
        Scanner keyboard = new Scanner(System.in);
        int finalTable = notes.length -1;
        System.out.println( "finalTable: " +finalTable);

        double sum = 0;
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Alumno: " + f + " Nota: " + c );
                notes[f][c] = keyboard.nextDouble();

                sum = sum + notes[f][c];
            }
            notes[f][finalTable] = sum/ finalTable;
            sum = 0;
        }

        for (int f = 0; f < 4; f++) {
            System.out.println("Las notal de alumno: " + f +  " son:");
            for (int c = 0; c < 3; c++) {

                System.out.println("Nota No "+ c + ": " +notes[f][c]);
            }

            System.out.println("La media es de: " + notes[f][finalTable]);

        }

        /*8-9-10 => 9
        * 8-5.50-6 => 6.5
        * 9-9-10 => 9,3
        * 7-5-4.50 => 5.5
        * */

    }
}