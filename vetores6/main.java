package vetores6;

import java.util.Locale;
import java.util.Scanner;
import vetores6.Employee;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Bem vindo ao sistema de aumentos ");
        System.out.println();
        System.out.println("Quantos funcionarios quer registrar ?");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
        System.out.println("Insira os dados do Funcionario: ");
        System.out.println("ID: ");
        int id = sc.nextInt();
        System.out.println("Nome: ");
        String name = sc.next();
        System.out.println("Salario: ");
        double salary = sc.nextDouble();
        
        Employee emp = new Employee(id,name,salary);
        list.add(emp);
    }
        System.out.println("Qual o id no funcionario que deseja aumentar o salario ?");
        int idssalary = sc.nextInt();
        Integer pos = position(list, idssalary);
        if (pos == null){
            System.out.println("Este id não existe!");

    }
        else{
        System.out.println("Informe a porcentagem: ");
        double percent = sc.nextDouble();
        list.get(pos).increaseSalary(percent);
    }
        System.out.println("");
        System.out.println("Lista de funcionarios");
        for(Employee emp : list){
        System.out.println(emp);
    }

    }
        public static Integer position(List<Employee> list, int id){
        for(int i = 0; i< list.size(); i++){
        if(list.get(i).getId() == id){
        return i;
    }
    }
        return null;
    }
    }

