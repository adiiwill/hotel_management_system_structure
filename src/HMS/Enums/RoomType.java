package HMS.Enums;

public enum RoomType {
    SINGLE(100),     // $100 / night
    DOUBLE(150),     // $150 / night
    SUITE(230),      // $230 / night
    PENTHOUSE(600);  // $600 / night

    private final int pricePerNight;

    RoomType(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getPricePerNight() { return pricePerNight; }
}
