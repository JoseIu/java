public class exercise04 {

    public static void main(String[] args) {
        int matriz [][] = new int[4][5];
        int numberToFill = 5;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 5;
            }
        }


        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c]);
            }
            System.out.println();
        }
    }
}
