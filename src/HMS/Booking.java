package HMS;

import HMS.Enums.BookingStatus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Booking {
    // Attributes
    private final String bookingID;
    private static int idIndex = 1_000_000;

    private Guest guest;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private BookingStatus bookingStatus;

    // Constructor
    public Booking(Guest guest, Room room, LocalDate checkInDate, LocalDate checkOutDate, BookingStatus bookingStatus) {
        bookingID = generateBookingID();
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingStatus = bookingStatus;

        idIndex++;
    }

    // Associated methods
    // (B)(7 digit)
    private String generateBookingID() {
        return "B" + idIndex;
    }

    public int calculateTotalPrice() {
        int stayLengthInDays = (int)ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        return room.getRoomType().getPricePerNight() * stayLengthInDays;
    }

    public void extendStay(int additionalNights) {
        checkOutDate.plusDays(additionalNights);
    }

    public void cancelBooking() {
        bookingStatus = BookingStatus.CANCELLED;
    }

    // Getters and setters
    public String getBookingID() {
        return bookingID;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    // Display
    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", guest=" + guest +
                ", room=" + room +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", bookingStatus=" + bookingStatus +
                '}';
    }
}
