package aula88;

import java.util.Locale;
import java.util.Scanner;

public class Aula88 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double media, soma = 0.0;
        double[] vect = new double[n];


        for(int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        media = soma / n;

        System.out.printf("AVERAGE HEIGHT = %.2f%n ", media);

        sc.close();

    }
}
