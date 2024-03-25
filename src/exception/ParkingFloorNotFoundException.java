package exception;

public class ParkingFloorNotFoundException extends RuntimeException {
    public ParkingFloorNotFoundException() {
        super();
    }

    public ParkingFloorNotFoundException(String message) {
        super(message);
    }
}
