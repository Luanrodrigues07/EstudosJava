package atividade1;

import java.util.Locale;
import java.util.Scanner;

import atividade1.Rectangle;

public class at1 {
   
    public static void main(String[]args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle x;

    x = new Rectangle();

    System.out.println("enter rectangule width and height: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();

    double a = (x.a * x.b);
    double p = (x.a + x.b) * 2.0;
    double d = Math.sqrt(x.a * x.a + x.b * x.b);

    System.out.printf("Triangule X area : %.4f%n", a);
    System.out.printf("Triangule X perimetro : %.4f%n", p);
    System.out.printf("Triangule X diagonal : %.4f%n", d);

sc.close();

    }
}