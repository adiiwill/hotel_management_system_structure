package HMS;

import HMS.Enums.PaymentStatus;
import HMS.Services.Service;

import java.util.LinkedList;
import java.util.List;

public class Bill {
    // Attributes
    private String billID;
    private static int idIndex = 10_000_000;

    private Booking booking;
    private List<Service> services = new LinkedList<Service>();
    private PaymentStatus paymentStatus;

    // Constructor
    public Bill(Booking booking, PaymentStatus paymentStatus) {
        billID = generateBillID();
        this.booking = booking;
        this.paymentStatus = paymentStatus;

        idIndex++;
    }

    // Associated methods
    // (BILL)(8 digit)
    private String generateBillID() {
        return "BILL" + idIndex;
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void removeService(Service service) {
        services.remove(service);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Service s : services) {
            sum += s.getPrice();
        }
        return sum + booking.calculateTotalPrice();
    }

    // Getters and setters
    public String getBillID() {
        return billID;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    // Display
    @Override
    public String toString() {
        return "Bill{" +
                "billID='" + billID + '\'' +
                ", booking=" + booking +
                ", total=" + calculateTotal() +
                ", services=" + services +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
