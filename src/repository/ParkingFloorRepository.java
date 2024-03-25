package repository;

import exception.ParkingFloorNotFoundException;
import models.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingFloorRepository;
    public ParkingFloorRepository(){
        parkingFloorRepository = new HashMap<>();
    }

    public ParkingFloor get(int ParkingFloorId){
        ParkingFloor ParkingFloor = parkingFloorRepository.get(ParkingFloorId);
        if(ParkingFloor == null){
            throw new ParkingFloorNotFoundException("Parking Floor not found with id : " + ParkingFloorId);
        }

        return ParkingFloor;
    }

    public void put(ParkingFloor ParkingFloor){
        parkingFloorRepository.put(ParkingFloor.getId(), ParkingFloor);
        System.out.println("Parking Floor has been added successfully!");
    }
}
