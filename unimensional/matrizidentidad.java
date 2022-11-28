package java_capitulo_7.matrizidentidad;

public class matrizidentidad {
    public static void main(String[] args) {
        int [] [] matrizidentidad=new int [5][5];

        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                if(i==j){
                    matrizidentidad[i][j]=1;
                }else{
                    matrizidentidad[i][j]=0;
                }
            }
        }
        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
        System.out.print(matrizidentidad[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
