package HMS.Services;

public class SpaService implements Service {
    // Attributes
    private String name;
    private String description;
    private int price;
    private int durationMinutes;
    private String therapistName;

    // Constructor
    public SpaService(String name, String description, int price, int durationMinutes, String therapistName) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.durationMinutes = durationMinutes;
        this.therapistName = therapistName;
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

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getTherapistName() {
        return therapistName;
    }

    public void setTherapistName(String therapistName) {
        this.therapistName = therapistName;
    }

    // Display
    @Override
    public String toString() {
        return "SpaService{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", durationMinutes=" + durationMinutes +
                ", therapistName='" + therapistName + '\'' +
                '}';
    }
}
