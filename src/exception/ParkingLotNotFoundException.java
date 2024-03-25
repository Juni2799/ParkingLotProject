package exception;

public class ParkingLotNotFoundException extends RuntimeException {
    public ParkingLotNotFoundException() {
        super();
    }

    public ParkingLotNotFoundException(String message) {
        super(message);
    }
}
