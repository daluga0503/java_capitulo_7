package java_capitulo_7.bidimensional.ejercicio11;

public class ejercicio11 {
    public static void main(String[] args) {
        int[][] array = new int [10][10];
        int max=0;
        int min=301;
        int suma = 0;

        for(int i = 0; i<10 ; i++){
            for(int j = 0; j <10 ; j++){
                array[i][j]=(int)(Math.random()*101)+100;
            }
        }


        for(int i = 0; i<10 ; i++){
            for(int j = 0; j <10 ; j++){
                if(i==j){
                System.out.printf("%5d",array[i][j]);
                suma=suma+array[i][j];
                if(array[i][j]>max){
                    max=array[i][j];
                }
                if(array[i][j]<min){
                    min=array[i][j];
                }
                }else{
                    System.out.print("     ");
                }
                
            }
            System.out.println("");
        }

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: "+min);
        System.out.println("El valor medio es: "+suma/10);



    }
}
