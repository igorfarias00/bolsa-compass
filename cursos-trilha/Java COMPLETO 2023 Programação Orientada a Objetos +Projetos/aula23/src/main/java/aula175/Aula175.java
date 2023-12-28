package aula175;

import aula175.enitites.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aula175 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        Reservation reserva1 = null;
        int roomNumber;
        Date checkIn, checkOut;
        checkIn = null;
        checkOut = null;

        System.out.print("Room number: ");
        roomNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkIn = sdf.parse(sc.nextLine());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkOut = sdf.parse(sc.nextLine());


        if (checkIn.before(checkOut)) {
            reserva1 = new Reservation(roomNumber, checkIn, checkOut);
            // tempo decorrido em millisegundos apartir de 1 de janeiro de 1970 ate hoje
            Long diasReserva = reserva1.duration();
            System.out.printf("Reservation: Room %d, check-in: %s, check-out: %s, %d nights%n", reserva1.getRoomNumber(), sdf.format(reserva1.getCheckIn()), sdf.format(reserva1.getCheckOut()), diasReserva);
        } else {
            System.out.println("Error in reservation: Check-out date must be after check-in date!");
        }

        System.out.println("Enter data to update the reservation: ");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkIn = sdf.parse(sc.nextLine());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkOut = sdf.parse(sc.nextLine());

        String update = reserva1.updateDates(checkIn, checkOut);

        if(update == null) {
            // tempo decorrido em millisegundos apartir de 1 de janeiro de 1970 ate hoje
            Long diasReserva = reserva1.duration();
            System.out.printf("Reservation: Room %d, check-in: %s, check-out: %s, %d nights%n", reserva1.getRoomNumber(), sdf.format(reserva1.getCheckIn()), sdf.format(reserva1.getCheckOut()), diasReserva);
        } else {
            System.out.println(update);
        }

        sc.close();
    }
}
