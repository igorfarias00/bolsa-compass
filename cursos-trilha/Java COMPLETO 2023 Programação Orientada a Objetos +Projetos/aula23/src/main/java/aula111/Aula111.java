package aula111;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula111 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-12-25");
        LocalDateTime d05 = LocalDateTime.parse("2023-12-25T15:30:26");
        Instant d06 = Instant.parse("2023-12-25T15:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));

        System.out.println("======================================");

        System.out.println("d05 = " + fmt1.format(d05));
        System.out.println("d05 = " + fmt2.format(d05));
        System.out.println("d05 = " + fmt4.format(d05));

        System.out.println("======================================");

        System.out.println("d06 = " + fmt3.format(d06));



    }
}
