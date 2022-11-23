package java_capitulo_7.matrizidentidad.ejercicio1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa con un array de 12 int");
        int []num=new int[12];
        num[0]=39;
        num[1]=-2;
        num[3]=0;
        num[5]=14;
        num[7]=5;
        num[8]=120;
    
        for(int i=1;i<=12;i++){
            System.out.print(num[i-1]+" ");
            }
            //los valores que no se han inicializado salen con valor cero
            sc.close();
    }
}
