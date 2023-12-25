package aula112;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula112 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-12-25");
        LocalDateTime d05 = LocalDateTime.now();
        Instant d06 = Instant.now();

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("America/Sao_Paulo"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("America/Sao_Paulo"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("=======================================");

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("=======================================");

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());


    }
}
