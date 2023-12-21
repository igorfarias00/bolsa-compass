package aula49;

import java.util.Scanner;

public class Aula49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, soma = 0 ;

        x = sc.nextInt();

        for(int i = 0; i < x; i++){
            soma += sc.nextInt();
            System.out.println("Valor de i: " + i);
        }

        System.out.println(soma);

    }
}
