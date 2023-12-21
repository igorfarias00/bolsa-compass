package aula64;

import java.util.Scanner;

public class Aula64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo x = null, y = null;
        int triangulosLidos = 0;
        char trianguloAtual = 'X';


        do {
            double a = 0, b = 0, c = 0;

            System.out.printf("Enter the measures pf triangle %c: %n", trianguloAtual);
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            if(trianguloAtual == 'X') {
                trianguloAtual = 'Y';
                x = new Triangulo(a, b, c);
                triangulosLidos++;

            } else {
                y = new Triangulo(a,b,c);
                triangulosLidos++;

            }

        } while (triangulosLidos < 2);


        System.out.println("Triangle X area: " + x.area);
        System.out.println("Triangle Y area: " + y.area);

        if (y.area > x.area){
            System.out.println("Larger area: Y");

        } else  if (y.area < x.area){
            System.out.println("Larger area: X");

        } else {
            System.out.println("Same Area");
        }


    }


}
