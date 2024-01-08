package aula224.Interface;

import aula224.Interface.entities.CarRental;
import aula224.Interface.entities.Vehicle;
import aula224.Interface.services.BrazilTaxService;
import aula224.Interface.services.RentalService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Aula224SemInterface {
    static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        LocalDateTime start= null, finish = null;
        String modelo;
        double precoHora = 0, precoDia = 0;


        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        modelo = bf.readLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        do {
            start = (LocalDateTime) tryRead(bf.readLine(), 2, 1);
        } while (start == null);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        do {
            finish = (LocalDateTime) tryRead(bf.readLine(), 2, 1);
        } while (finish == null);


        //System.out.println(start);


        System.out.print("Entre com o preço por hora: ");
        do {
            precoHora = (double) tryRead(bf.readLine(), 1,1);
        } while (precoHora <= 0);
        System.out.print("Entre com o preço por dia: ");
        do {
            precoDia = (double) tryRead(bf.readLine(), 1, 2);
        } while (precoDia <= 0);

//        System.out.println(precoHora);
//        System.out.println(precoDia);
//        System.out.println(Duration.between(start, finish).toDays());


        CarRental cr = new CarRental(start, finish, new Vehicle(modelo));

        BrazilTaxService taxService = new BrazilTaxService();

        RentalService rentalService = new RentalService(precoHora, precoDia, new BrazilTaxService());

        rentalService.processInvoice(cr);

        //System.out.println(taxService.tax(50.0));


        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
    }





    public static Object tryRead(String source, int option ,int error) {
        double target = -1.0;
        LocalDateTime date = null;
        if (option == 1) {
            try {
                target = Double.parseDouble(source);

            } catch (NumberFormatException e) {
                switch (error) {
                    case 1 -> System.out.println("Valor digitado incorreto para o preço por hora!");
                    case 2 -> System.out.println("Valor digitado incorreto para o preço por Dia!");
                }
            }

            return target;
        } else if(option == 2 ){
            try {
                date = LocalDateTime.parse(source, fmt);
                System.out.println(date);

            } catch (DateTimeParseException e) {
                if (error == 1) {
                    System.out.println("Valor invalido para a data!");
                }
            }
            return date;
        }

        return null;
    }
}
