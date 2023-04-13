package vetores3;

import java.util.Locale;
import java.util.Scanner;
import vetores3.pessoas;

public class main {
    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        pessoas[] vect = new pessoas[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            int peso = sc.nextInt();
            vect[i] = new pessoas(nome,peso);

            System.out.printf("Os nomes e pessoas das pessoas são: %.2f%n", nome+peso);

        }

    sc.close(); 
}
} 