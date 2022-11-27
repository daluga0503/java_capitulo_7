package java_capitulo_7.unimensional.ejercicio4;

public class ejercicio4 {
    public static void main(String[] args) {
        int []num=new int[20];

        for(int i = 1; i<=20; i++){
            num[i-1]=(int)(Math.random()*101);
        }

        for(int i=1; i<=20; i++){
            System.out.println(num[i-1] +" " + (int)Math.pow(num[i-1], 2) + " " + (int)Math.pow(num[i-1], 3));
        }


    }
}
