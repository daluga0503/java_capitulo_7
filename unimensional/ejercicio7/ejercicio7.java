package java_capitulo_7.unimensional.ejercicio7;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []array=new int[100];

        for(int i = 0; i<100; i++){
            array[i]=(int)(Math.random()*21);
            System.out.printf("%d ", array[i]);
        }

        System.out.print("Introduzca un número de los que se han mostrado: ");
        int buscar = sc.nextInt();
        System.out.print("Introduzca el valor por el que sustituirlo: ");
        int sustituirlo=sc.nextInt();

        for(int i = 0; i<100; i++){
            if(array[i]==buscar){
                array[i]=sustituirlo;
                System.out.printf("\"%d\" ", array[i]);
            }
            else{
                System.out.printf("%d", array[i]);
            }
        }
    }
}
