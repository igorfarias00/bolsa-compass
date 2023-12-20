package aula24;

public class Aula24 {
    public static void main(String[] args) {
        double r;
        int b, a;

        a = 5;
        b = 2;


        // converte o resultado para inteiro, pois os operandos sao inteiros
        r = a / b;

        System.out.println(r);


        // resultado correto, com o typecast
        r = (double)a / b;

        System.out.println(r);

        // typecast com perda da casa decimal
        r = 5.2;
        b = (int) r;

        System.out.println(b);
    }

}
