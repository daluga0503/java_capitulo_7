package java_capitulo_7.bidimensional.ejercicio2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int [][] num= new int[4][5];

        for(int filas=0;filas<4;filas++){

            for(int columnas=0;columnas<5;columnas++){
                num[filas][columnas]=sc.nextInt();
            }

        }

        int suma_total=0;
        int suma_fila=0;
        int suma_columna=0;

        //mostramos los numeros del array y la suma de cada fila

        
        for(int filas=0;filas<4;filas++){
            
            suma_fila=0;
            
            for(int columnas=0;columnas<5;columnas++){
                System.out.printf("%10s",num[filas][columnas]);
                suma_fila=suma_fila+num[filas][columnas];
            }
            
            System.out.printf("%10s",suma_fila);
            System.out.println();
        }
        
        for(int columnas=0;columnas<5;columnas++){
                    
            suma_columna=0;
            
            for(int filas=0;filas<4;filas++){
                suma_columna=suma_columna+num[filas][columnas];
            }

            suma_total=suma_total+suma_columna;

            System.out.printf("%10s",suma_columna);

        }

            System.out.printf("%10s",suma_total);

        sc.close();
        }
	}

