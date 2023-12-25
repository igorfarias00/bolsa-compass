package aula98;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Aula98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco");

        System.out.println(list.size());

        //list.remove("Anna");

        //list.remove(1);

        for( String x : list){
            System.out.println(x);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        //list.removeIf( x -> x.charAt(0) == 'M');
//
//        for( String x : list){
//            System.out.println(x);
//        }

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");


        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for( String x : resultado){
            System.out.println(x);
        }

        String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

        System.out.println(nome);

    }
}
