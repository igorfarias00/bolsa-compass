import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double x = 10.35784;

        String nome = "maria";
        int idade = 31;
        double renda = 4000.0;

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // ------------------------------------------------------------

        System.out.println(x);

        System.out.printf("%.2f%n", x);

        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US);

        System.out.printf("%.2f%n", x);

        System.out.printf("%.4f%n", x);

        System.out.println("RESULTADO: " + x + " METROS");

        System.out.printf("RESULTADO = %.2f Metros %n", x);



        System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, renda);

        System.out.println(Arrays.toString(Locale.getISOCountries()));

        Locale.setDefault(Locale.forLanguageTag("BR"));

        System.out.println("Products: ");
        System.out.printf("%s, wich price is $ %.2f %n", product1, price1);
        System.out.printf("%s, wich price is $ %.2f %n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %c %n", age, code, gender);

        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);

    }

}
