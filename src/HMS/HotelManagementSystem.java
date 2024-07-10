package HMS;

import HMS.Enums.BookingStatus;
import HMS.Enums.PaymentStatus;
import HMS.Enums.RoomStatus;
import HMS.Enums.RoomType;
import HMS.Services.RoomService;
import HMS.Services.SpaService;

import java.time.LocalDate;
import java.time.LocalTime;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Guest g1 = new Guest("Rich Adam", "+11 22 333 4444", "1234 Random Land, Random st. 5/A", 12);

        Room r1 = new Room(RoomType.PENTHOUSE, 5, RoomStatus.OCCUPIED);

        Employee e1 = new Employee("Tom", "Therapist", "DP01", 470);

        Booking b1 = new Booking(g1, r1, LocalDate.now(), LocalDate.now().plusDays(3), BookingStatus.CHECKED_IN);

        Bill bill = new Bill(b1, PaymentStatus.UNPAID);
        bill.addService(new RoomService("Food Order", "No description...", 4, LocalTime.now().plusMinutes(10)));
        bill.addService(new SpaService("Massage", "No description...", 12, 45, "Tom"));

        System.out.println(bill.toString());
    }
}
