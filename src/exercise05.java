import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        int[][] flys = new int[2][3];

        //rellenamos
        Scanner keyboard = new Scanner(System.in);
        for (int f = 0; f <2 ; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingresar cantidad de asitentos: " +f +" Horario " + c);

                flys[f][c]= keyboard.nextInt();
            }
        }

        Scanner keyboard2 = new Scanner(System.in);
        String bandera = "";
        int destiny, horary, seats;
        while (!bandera.equalsIgnoreCase("finish")){

            System.out.println("Ingresar el número del destino:");
            destiny = keyboard2.nextInt();
            System.out.println("Ingresar el Horario del vuelo:");
            horary = keyboard2.nextInt();
            System.out.println("Ingresar la cantidad de asientos:");
            seats = keyboard2.nextInt();

            if(flys[destiny][horary] >= seats){
                System.out.println("Su reserva fue realizada con éxito 🚀");

                flys[destiny][horary] = flys[destiny][horary] -seats;
            }else {

                System.out.println("No se pudo realizar la operación dado que no hay asientos 😥");

            }
        }

    }
}
