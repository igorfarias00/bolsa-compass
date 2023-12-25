package aula110;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Aula110 {
    public static void main(String[] args) {
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate date = LocalDate.now();
        LocalDateTime time = LocalDateTime.now();
        Instant now = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");


        LocalDate d08 = LocalDate.parse("25/12/2023", formato1);
        LocalDateTime d09 = LocalDateTime.parse("25/12/2023 15:26", formato2);

        LocalDate d10 = LocalDate.of(2023, 12, 25);
        LocalDateTime d11 = LocalDateTime.of(2023, 12, 25, 15, 28);

        System.out.println(date);
        System.out.println(time);
        System.out.println(now);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);

        System.out.println(d08);
        System.out.println(d09);

        System.out.println(d10);
        System.out.println(d11);

    }
}
