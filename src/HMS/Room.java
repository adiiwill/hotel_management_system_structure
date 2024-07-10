package HMS;

import HMS.Enums.RoomStatus;
import HMS.Enums.RoomType;

public class Room {
    // Attributes
    private final String roomID;
    private static int idIndex = 100;

    private RoomType roomType;
    private int capacity;
    private RoomStatus roomStatus;

    // Constructor
    public Room(RoomType roomType, int capacity, RoomStatus roomStatus) {
        roomID = generateRoomID();
        this.roomType = roomType;
        this.capacity = capacity;
        this.roomStatus = roomStatus;

        idIndex++;
    }

    // Associated methods
    // (R)(3 digit)
    private String generateRoomID() {
        return "R" + idIndex;
    }

    // Getters and setters
    public String getRoomID() {
        return roomID;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    // Display
    @Override
    public String toString() {
        return "Room{" +
                "roomID='" + roomID + '\'' +
                ", roomType=" + roomType +
                ", capacity=" + capacity +
                ", roomStatus=" + roomStatus +
                '}';
    }
}
