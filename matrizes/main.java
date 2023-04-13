package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("matrizes teste");
        int n = sc.nextInt();
        int mat [][] = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = sc.nextInt(); 
            }
        }

        System.out.println("Diagonal");
        for(int i = 0; i<n; i++){
            System.out.println(mat[i][i]+ " "); 
        }

        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] < 0 ){
                    count++; 
        }   
        }
        }
        System.err.println("Numeros negativos: "+count);



        sc.close();
    }
}