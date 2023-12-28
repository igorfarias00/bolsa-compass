package aula173;

import aula173.enitites.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Aula173 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        boolean reservation = false;
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

        if (checkIn.before(checkOut)){
            reserva1 = new Reservation(roomNumber, checkIn, checkOut);

            // tempo decorrido em millisegundos apartir de 1 de janeiro de 1970 ate hoje
            Long diasReserva = reserva1.duration();
            System.out.printf("Reservation: Room %d, check-in: %s, check-out: %s, %d nights%n", reserva1.getRoomNumber(),sdf.format(reserva1.getCheckIn()), sdf.format(reserva1.getCheckOut()), diasReserva );
            reservation = true;
        } else {
            System.out.println("Error in reservation: Check-out date must be after check-in date!");
        }

        if(reservation){
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.nextLine());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.nextLine());

            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (checkIn.before(checkOut)){
               reserva1.updateDates(checkIn, checkOut);

                // tempo decorrido em millisegundos apartir de 1 de janeiro de 1970 ate hoje
                Long diasReserva = reserva1.duration();
                System.out.printf("Reservation: Room %d, check-in: %s, check-out: %s, %d nights%n", reserva1.getRoomNumber(),sdf.format(reserva1.getCheckIn()), sdf.format(reserva1.getCheckOut()), diasReserva );

            } else {
                System.out.println("Error in reservation: Check-out date must be after check-in date!");
            }
        }






    }
}
