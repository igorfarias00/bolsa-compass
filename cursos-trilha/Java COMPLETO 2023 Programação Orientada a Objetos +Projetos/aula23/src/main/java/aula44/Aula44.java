package aula44;

import java.util.Scanner;

public class Aula44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, soma = 0;

        x = sc.nextInt();

        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.println("A soma dos numeros é " + soma);

    }
}
