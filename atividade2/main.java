package atividade2;
import java.util.Scanner;
import java.util.Locale;
import atividade2.complemento;
public class main {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);

        complemento x;

        x = new complemento();

        System.out.println("infome o Nome do funcionario");
        x.nome = sc.next();
        System.out.println("infome o Salario do funcionario: ");
        x.salario = sc.nextDouble();
        System.out.println("infome o desconto do funcionario: ");
        x.taxa = sc.nextDouble();

        double Liquido = (x.salario - x.taxa);
        System.out.println("informe a porcentagem do aumento:  ");
        x.aumento = sc.nextDouble();

        double incremento = (x.salario / x.aumento);
        double salarioFinal = (Liquido + incremento);

        System.out.println("Os dados atualizados do funcionario são:" );
        System.out.println("-------------------");
        System.out.println(x.nome );
        System.out.println("$"+salarioFinal);
        System.out.println("-------------------");

        sc.close();
    }
}
