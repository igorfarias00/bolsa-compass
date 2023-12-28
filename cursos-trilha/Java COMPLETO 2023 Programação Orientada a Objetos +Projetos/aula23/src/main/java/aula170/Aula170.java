package aula170;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        method1();

        System.out.println("Fim do programa");

        sc.close();
    }


    public static void method1(){
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");
    }

    public static void method2(){
        System.out.println("*** METHOD2 START ***");
        Scanner sc = new Scanner(System.in);


        String[] vect = sc.nextLine().split(" ");

        try {
            int position = sc.nextInt();

            System.out.println(vect[position]);

        } catch (InputMismatchException inputMismatchException){
            System.out.println("Input invalido!");
            inputMismatchException.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException arrayOut){
            System.out.println("Posição invalida!");
            arrayOut.printStackTrace();

        }
        sc.close();
        System.out.println("*** METHOD2 END ***");
    }
}
