package atividade3;
import java.util.Locale;
import java.util.Scanner;
import atividade3.complemento;

public class main {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        complemento x;

        double media = 60;

        x = new complemento();
        
        System.out.println("");
        System.out.println("Bem vindo ao sistema de soma de nota dos trimestres.");
        System.out.println("infomo que a media considera é 60 e a nota maxima é 100.");
        System.out.println("");
        System.out.println("infome o nome do Aluno: ");
        x.nome = sc.next();

        System.out.println("infome a nota do Primeiro Trimestre: ");
        x.TR1 = sc.nextDouble();

        System.out.println("infome a nota do Segundo Trimestre: ");
        x.TR2 = sc.nextDouble();

        System.out.println("infome a nota do Terceiro Trimestre: ");
        x.TR3 = sc.nextDouble();

        double nota = (x.TR1 + x.TR2 + x.TR3);
        double notafaltante = (media - nota);

        if(nota >= 60) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("O aluno "+x.nome+" passou com a nota: " +nota+" de 100");
            System.out.println("------------------------------------------------------------------");
        }
        else if (nota <= 60){
            System.out.println("------------------------------------------------------------------");
            System.out.println("O aluno "+x.nome+" reprovou com a nota: " +nota+" de 100");
            System.out.println("O aluno precisa de mais "+notafaltante+" pontos para passar");
            System.out.println("------------------------------------------------------------------");
        }


        sc.close();
    }
    
}
