package service.strategy;

import models.Enums.*;
import models.Gate;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitService {
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private GateRepository gateRepository;

    public InitService(ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository,
                       ParkingSpotRepository parkingSpotRepository, GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.gateRepository = gateRepository;
    }

    public ParkingLot init(){
        System.out.println("***** Starting System Initialisation *****");

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Khanna's DriveThrough");
        parkingLot.setAddress("Gurgaon, Haryana");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypes(Arrays.asList(VehicleType.EV, VehicleType.LUXE, VehicleType.FOUR_WHEELER, VehicleType.TWO_WHEELER));

        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for(int i=1;i<=10;i++){
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);

            List<ParkingSpot> parkingSpots = new ArrayList<>();
            for(int j=1;j<=10;j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(j);
                parkingSpot.setSpotNumber((i*100) + j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                parkingSpots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }

            parkingFloor.setParkingSpots(parkingSpots);

            Gate entrygate = new Gate();
            entrygate.setId((i*1000) + 1);
            entrygate.setGateNumber((i*100) + 1);
            entrygate.setGateStatus(GateStatus.OPEN);
            entrygate.setOperatorName("ENTRY_ROBO_" + i);
            entrygate.setGateType(GateType.ENTRY);
            gateRepository.put(entrygate);

            Gate exitgate = new Gate();
            exitgate.setId((i*1000) + 2);
            exitgate.setGateNumber((i*100) + 2);
            exitgate.setGateStatus(GateStatus.OPEN);
            exitgate.setOperatorName("EXIT_ROBO_" + i);
            exitgate.setGateType(GateType.EXIT);
            gateRepository.put(exitgate);

            parkingFloor.setGates(Arrays.asList(entrygate, exitgate));
            parkingFloorRepository.put(parkingFloor);
            parkingFloors.add(parkingFloor);
        }
        parkingLot.setParkingFloors(parkingFloors);
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);
    }
}
