package aula176.model.enitites;

import aula176.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;

    private Date checkIn;

    private Date checkOut;


    // ==========================================================================
    public Reservation() {
    }


    public Reservation(Integer roomNumber, Date checkIn, Date checkOut)  {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be future dates");
        } if (!checkOut.after(checkIn)){
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // ==========================================================================
    public Long duration (){

        //return TimeUnit.DAYS.convert((checkOut.getTime() - checkIn.getTime()), TimeUnit.MILLISECONDS);
        return (checkOut.getTime() - checkIn.getTime()) / (1000 * 60 *60 * 24);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be future dates");
        } if (!checkOut.after(checkIn)){
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }

        this.checkOut = checkOut;
        this.checkIn = checkIn;


    }


    public String toString(){
        StringBuilder bd = new StringBuilder();
        bd.append(" room ");
        bd.append(roomNumber);
        bd.append(", Check-in: ");
        bd.append(sdf.format(checkIn));
        bd.append(", Check-out: ");
        bd.append(sdf.format(checkIn));
        bd.append(", ");
        bd.append(duration());
        bd.append(" Nights.");


        return bd.toString();
    }

    // +++++++++++++++++++++++++++++++++++-------------------------------------


    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        Reservation.sdf = sdf;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
}
