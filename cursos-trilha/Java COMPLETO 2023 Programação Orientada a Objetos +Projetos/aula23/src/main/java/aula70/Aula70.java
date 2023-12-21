package aula70;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Aula70 {


    public static void main(String[] args) {

        //Calculator cal = new Calculator();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

       // double c = cal.circumference(radius);

        //double v = cal.volume(radius);

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);


        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

    }


}
