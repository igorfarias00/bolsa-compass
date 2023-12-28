package aula175.enitites;

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


    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // ==========================================================================
    public Long duration (){

        //return TimeUnit.DAYS.convert((checkOut.getTime() - checkIn.getTime()), TimeUnit.MILLISECONDS);
        return (checkOut.getTime() - checkIn.getTime()) / (1000 * 60 *60 * 24);
    }

    public String updateDates(Date checkIn, Date checkOut){
        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)){
            return "Reservation dates for update must be future dates";
        } if (!checkOut.after(checkIn)){
            return "Error in reservation: Check-out date must be after check-in date";
        }

        this.checkOut = checkOut;
        this.checkIn = checkIn;

        return null;
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
