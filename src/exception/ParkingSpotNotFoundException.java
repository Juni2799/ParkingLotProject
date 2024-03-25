package exception;

public class ParkingSpotNotFoundException extends RuntimeException {
    public ParkingSpotNotFoundException() {
        super();
    }

    public ParkingSpotNotFoundException(String message) {
        super(message);
    }
}
