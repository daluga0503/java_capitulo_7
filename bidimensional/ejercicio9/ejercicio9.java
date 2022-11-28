package java_capitulo_7.bidimensional.ejercicio9;

public class ejercicio9 {
    public static void main(String[] args) {
        int [][] auxiliar = new int[12][12];
        int [][] cuadrado = new int [12][12];

        for( int i = 0; i<12; i++){
            for( int j = 0; j<12; j++){
                cuadrado [i][j]=(int)(Math.random()*101);
            }
        }//for

        for( int i = 0; i<12; i++){
            for( int j = 0; j<12; j++){
                System.out.printf("%3d",cuadrado[i][j]);
            }
            System.out.println("");
        }









        for( int i = 0; i<12; i++){
            for( int j = 0; j<12; j++){
                System.out.printf("%3d",auxiliar[i][j]);
            }
            System.out.println("");
        }


    }
}
