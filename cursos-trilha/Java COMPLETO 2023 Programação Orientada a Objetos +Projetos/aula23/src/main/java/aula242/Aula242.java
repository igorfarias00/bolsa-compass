package aula242;

import aula242.entities.Client;

public class Aula242 {
    public static void main(String[] args) {
        String a = "maria";
        String b = "Alex";
        String c = "Alex";
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Maria", "maria@gmail.com");


        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        System.out.println(c1 == c3);

    }
}
