package vetores2;

import java.util.Locale;
import java.util.Scanner;
import vetores2.products;

public class main {
    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        products[] vect = new products[n]; 

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new products(name, price);
        } 
        double sum = 0.0;
        for (int i=0; i<vect.length ; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("AVARANGE = : %.2%n", avg);

    sc.close(); 
}
} 