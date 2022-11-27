package java_capitulo_7.bidimensional.ejercicio5;

public class ejercicio5 {
    public static void main(String[] args) {
        int minimo = 1002;
        int maximo = 0;

        int minimofila = 0;
        int maximofila= 0;
        int minimocolumna = 0;
        int maximocolumna= 0;

        int [] [] num = new int [6] [10];

        for(int i = 0;i<6;i++){
            for(int j = 0; j<10;j++){
                num [i][j] = (int)(Math.random()*1001);
            }
        }
        
        for(int i = 0;i<6;i++){
            for(int j = 0; j<10;j++){
                System.out.printf("%5d ", num[i][j]);
                if(num[i][j] < minimo){
                    minimo = num[i][j];
                    minimofila = i;
                    minimocolumna = j;
                }
    
                if(num[i][j] > maximo){
                    maximo = num[i][j];
                    maximofila = i;
                    maximocolumna = j;
                }
            }
            System.out.println("│");
        }

        System.out.println("La posicion mínima es " + minimofila + ", " + minimocolumna);
        System.out.println("La posicion máxima es " + maximofila + ", " + maximocolumna);
    }
}

