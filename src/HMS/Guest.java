package HMS;

public class Guest {
    // Attributes
    private final String guestID;
    private static int idIndex = 100_000;

    private String name;
    private String contact;
    private String address;
    private int loyaltyPoints;

    // Constructor
    public Guest(String name, String contact, String address, int loyaltyPoints) {
        guestID = generateGuestID();
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.loyaltyPoints = loyaltyPoints;

        idIndex++;
    }

    // Associated methods
    // (G)(6 digit)
    private String generateGuestID() {
        return "G" + idIndex;
    }

    // Getters and setters
    public String getGuestID() {
        return guestID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addLoyaltyPoints(int amount) {
        this.loyaltyPoints += amount;
    }

    public void useLoyaltyPoints(int amount) {
        this.loyaltyPoints -= amount;
    }

    // Display
    @Override
    public String toString() {
        return "Guest{" +
                "guestID='" + guestID + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}
