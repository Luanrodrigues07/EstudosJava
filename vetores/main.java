package vetores;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vect = new double[n];

        for(int i=0; i<n; i++) {
            vect[1] = sc.nextInt(); 
        }

        double sum = 0.0;
        for(int i=0; i<n; i++){
            sum += vect[i];
        }
        double avg = sum /n;

        System.out.println(avg);


    sc.close();
}
}