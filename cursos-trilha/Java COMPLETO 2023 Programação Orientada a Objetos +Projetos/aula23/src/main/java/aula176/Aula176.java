package aula176;

import aula176.model.enitites.Reservation;
import aula176.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aula176 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        Reservation reserva1 = null;
        int roomNumber;
        Date checkIn, checkOut;
        checkIn = null;
        checkOut = null;

        try {
            System.out.print("Room number: ");
            roomNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.nextLine());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.nextLine());

            reserva1 = new Reservation(roomNumber, checkIn, checkOut);

            System.out.println("Reservation: " + reserva1.toString());

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.nextLine());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.nextLine());

            reserva1.updateDates(checkIn, checkOut);

            System.out.println("Reservation: " + reserva1.toString());


        } catch (ParseException parse) {
            System.out.println("Invalid date format");
        } catch (DomainException argumentos){
            System.out.println("Error in reservation: " + argumentos.getMessage());
        }
        sc.close();
    }
}
