package aula66;

import java.util.Locale;
import java.util.Scanner;

public class aula66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant;
        double price;
        String name;

        Locale.setDefault(Locale.US);

        Product produto1 = null;

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        name = sc.nextLine();

        System.out.println("Price: ");
        price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        quant = sc.nextInt();

        produto1 = new Product(name, price, quant);

        System.out.println(produto1.name + ", " + produto1.price + ", " + produto1.quantity);




        sc.close();

    }
}
