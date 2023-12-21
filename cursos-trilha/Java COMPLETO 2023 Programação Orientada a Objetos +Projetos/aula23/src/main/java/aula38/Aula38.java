package aula38;

import java.util.Scanner;

public class Aula38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        switch (x){
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("Segundaaa");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sextou");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }


    }
}
