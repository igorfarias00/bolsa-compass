package aula238;

import java.util.Scanner;

public class Aula238 {
    public static void main(String[] args) {

        // para esse problema, a classe prinservice só funcionaria para inteiros, como podemos utilizar para strings?

        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.println("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: "  + ps.first());

        sc.close();

    }
}
