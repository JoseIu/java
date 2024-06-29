package funciones;

import static funciones.funcionesStatic.*;
public class operaciones {
    public static void main(String[] args) {

        helloWorld();

        int sumN1N2 = suma(1,2);
        System.out.println("Suma de 1 +2: " + sumN1N2);

        int [] numbers = new int[3];
        numbers[0]=5;
        numbers[1]=10;
        numbers[2]=10;

        int sumbersSum = arryaSum(numbers);

        System.out.println("La suma del array es de: " + sumbersSum);

    }
}
