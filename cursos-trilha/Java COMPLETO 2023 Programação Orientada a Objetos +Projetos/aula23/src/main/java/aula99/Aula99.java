package aula99;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aula99 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();
        String nome;
        int id;
        double salario;


        int n = sc.nextInt();



        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Employee #%d%n", i);
            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            nome = sc.nextLine();

            System.out.print("Salary: ");
            salario = sc.nextDouble();

            empregados.add(new Empregado(id, nome, salario));

        }

        System.out.print("Enter the employe id that will have salary increase: ");
        id = sc.nextInt();
        sc.nextLine();

        boolean flag = false;
        int finalId = id;

        for (Empregado empregado: empregados) {
            if (empregado.getId() == finalId){
                flag = true;
            }
        }

        if(flag) {
            System.out.print("Enter the percentage: ");
            double porcentagem = sc.nextDouble();
            empregados.stream().filter(empregado -> empregado.getId() == finalId).findFirst().get().incrementoSalario(porcentagem);

        } else {
            System.out.println("This id does not exist");
        }


        //System.out.println(empregados.stream().filter(empregado -> empregado.getId() == finalId));

        System.out.println("List of employees");
        for (Empregado empregado: empregados) {
            System.out.printf("%d, %s, %.2f%n", empregado.getId(), empregado.getNome(), empregado.getSalario());
        }



    }
}
