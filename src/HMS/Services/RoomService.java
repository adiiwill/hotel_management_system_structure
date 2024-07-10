package HMS.Services;

import java.time.LocalTime;

public class RoomService implements Service {
    // Attributes
    private String name;
    private String description;
    private int price;
    private LocalTime deliveryTime;

    // Constructor
    public RoomService(String name, String description, int price, LocalTime deliveryTime) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.deliveryTime = deliveryTime;
    }

    // Getters and setters
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    // Display
    @Override
    public String toString() {
        return "RoomService{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}
