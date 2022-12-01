package java_capitulo_7.bidimensional.rotarmatriz;
import java.util.Scanner;
public class rotarmatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("De que amplitud quieres la matriz: ");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        int[][] aux = new int [n][n];


        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                array[i][j]=(int)(Math.random()*11);
            }
        }


        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
            System.out.print(array[i][j]+"   ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println(" ");

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
            aux[j][n-1-i] = array[i][j];
            }
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(aux[i][j] +"   ");
        }
            System.out.println("");
        }

/***********************  para la izquierda  *****************************/

            int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
            int tamanio = matriz.length;
            int[][] nuevamatriz = new int[tamanio][tamanio];

            for (int x=0;x<tamanio;x++) {
                for (int y=0;y<tamanio;y++) {
                  // Ejecutamos la rotación
                }
            }

            for (int x=0;x<tamanio;x++) {
                for (int y=0;y<tamanio;y++) {
                nuevamatriz[tamanio-1-y][x] = matriz[x][y];
                }
            }

            for (int x=0;x<tamanio;x++) {
                for (int y=0;y<tamanio;y++) {
                System.out.print(nuevamatriz[x][y]+" ");
                }
                System.out.println("");
            }



            /******************************* multiplicacion de matrices  ************************************/

            // int [][] matriz1 = new int [n][n];
            int [][] matriz2 = new int [n][n];


            int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
            };

            









    }
}
