package aula113;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula113 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.now();
        LocalDateTime d05 = LocalDateTime.now();
        Instant d06 = Instant.now();

        LocalDate semanaPassada = d04.minusDays(7);
        LocalDate semanaQueVem  = d04.plusDays(7);

        System.out.println("semanaPassada = " + semanaPassada);
        System.out.println("semanaQueVem = " + semanaQueVem);

        LocalDateTime semanaPassadaDateTime = d05.minusDays(7);
        LocalDateTime semanaQueVemDateTime  = d05.plusDays(7);

        System.out.println("==============================");

        System.out.println("semanaPassadaDateTime = " + semanaPassadaDateTime);
        System.out.println("semanaQueVemDateTime = " + semanaQueVemDateTime);

        Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant semanaQueVemInstant  = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("==============================");

        System.out.println("semanaPassadaInstant = " + semanaPassadaInstant);
        System.out.println("semanaQueVemInstant = " + semanaQueVemInstant);

        System.out.println("==============================");

        Duration t1 = Duration.between(semanaPassadaDateTime, d05);

        System.out.println("t1 dias = " + t1.toDays());

        System.out.println("==============================");

        Duration t2 = Duration.between(semanaPassada.atStartOfDay(), d04.atStartOfDay());

        System.out.println("t2 dias = " + t2.toDays());

        System.out.println("==============================");

        Duration t3 = Duration.between(semanaPassadaInstant, d06);

        System.out.println("t3 dias = " + t3.toDays());

        System.out.println("==============================");

        Duration t4 = Duration.between(d06, semanaPassadaInstant);

        System.out.println("t4 dias = " + t4.toDays());
    }
}
