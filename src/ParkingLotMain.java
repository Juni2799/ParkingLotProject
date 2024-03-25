import controllers.InitController;
import models.ParkingFloor;
import models.ParkingLot;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import service.strategy.InitService;

public class ParkingLotMain {
    public static void main(String[] args) {

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        GateRepository gateRepository = new GateRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

        InitService initService = new InitService(parkingLotRepository, parkingFloorRepository, parkingSpotRepository, gateRepository);

        InitController initController = new InitController(initService);
        ParkingLot parkingLot = initController.generateData();
    }
}