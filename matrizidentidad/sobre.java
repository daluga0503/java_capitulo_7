package java_capitulo_7.matrizidentidad;
import java.util.Scanner;

public class sobre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila = sc.nextInt();
        int columna=sc.nextInt();
        int [][] sobre1=new int [fila][columna];
        for(int i=0; i<fila;i++){
            for(int j=0;j<columna;j++){
                if(i==0 || j==0 || i==(fila-1) ||  j==(columna-1) || i==j || i==(fila-j)-1){
                    sobre1 [i] [j] = 1;
                }else{
                    sobre1 [i] [j] = 0;
                }
            }
        }


        for(int i=0; i<fila;i++){
            for(int j=0;j<columna;j++){
                System.out.print(sobre1 [i] [j] +" ");
            }
            System.out.println("");
        }
    }
}
