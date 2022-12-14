package java_capitulo_7.bidimensional.ejercicio6;

public class ejercicio6 {
    public static void main(String[] args) {
        int minimo = 1002;
        int maximo = 0;

        int minimofila = 0;
        int maximofila= 0;
        int minimocolumna = 0;
        int maximocolumna= 0;
        boolean repetido;

        int [] [] num = new int [6] [10];

        for(int i = 0;i<6;i++){
            for(int j = 0; j<10;j++){
                do{
                    num [i][j] = (int)(Math.random()*1001); //Damos los números al array
                    repetido = false; //Usaremos el boolean para salir del do-while

                    for (int j2 = 0; j2 < 10*i+j; j2++) { //Vamos a comprobar todos los números del array y si no es igual saldrá del do-while
                        if(num[i][j] == num [j2/10] [j2%10] ){
                            repetido=true;
                        }
                    }
                }while(repetido);
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

