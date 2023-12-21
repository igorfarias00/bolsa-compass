package aula39;

public class Aula39 {
    public static void main(String[] args) {
        double preco, desconto;

        preco = 34.5;

        desconto = (preco < 20.0 ) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto );

    }
}
