package aula89;

import aula89.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Aula89 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double soma = 0.0, media;
        Product[] products = new Product[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            soma += price;
            products[i] = new Product(name, price);
        }

        media = soma / n;

        System.out.printf("AVERAGE PRICE = %.2f%n", media);



    }
}
