package funciones;

public class funcionesStatic {


    public  static void helloWorld(){

        System.out.println("Hola mundo");
    }
    public static int suma(int n1, int n2){

        return n1 + n2;
    }

    public  static int arryaSum (int[] miArray){

        int result = 0;
        for (int i = 0; i < miArray.length; i++) {
            result +=  miArray[i];
        }
        return result;
    }
}
