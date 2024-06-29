import java.util.Scanner;

public class exercise03 {

    public static void main(String[] args) {
        String cities[] = new String[3];
        int minTemp[] = new int[3];
        int maxTemp[]= new int[3];
        //Guardamos el indice
        int cityWithMin= 0;
        int cityWithMax= 0;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < cities.length; i++) {

            System.out.println("Nombre de la ciudad: " + i);
            cities[i] = keyboard.nextLine();

            System.out.println("Temperatura mínima: ");
            minTemp[i] = keyboard.nextInt();


            System.out.println("Temperatura Máxima: ");
            maxTemp[i] = keyboard.nextInt();
            keyboard.nextLine();
            if(cityWithMin > minTemp[i]){
                cityWithMin = i;
            }

            if(cityWithMax < maxTemp[i]){

                cityWithMax = i;
            }
        }

        for (int i = 0; i < cities.length; i++) {
            System.out.println("Ciudad: " + cities[i]+ " Tiene una temperatura min de: " + minTemp[i]+" y una max de: "+minTemp[i]);


            System.out.println("La ciudad con una temMin es de: " + cities[cityWithMin] + " Con=>: " + minTemp[cityWithMin] + " grados");
            System.out.println("La ciudad con una temMax es de: " + cities[cityWithMax] + " Con=> " + maxTemp[cityWithMax]+ " grados");

        }
    }
}
