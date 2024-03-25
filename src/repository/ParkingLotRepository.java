package repository;

import exception.ParkingLotNotFoundException;
import models.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotRepository;
    private static int idCounter = 0;
    public ParkingLotRepository(){
        parkingLotRepository = new HashMap<>();
    }

    public ParkingLot get(int parkingLotId){
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);
        if(parkingLot == null){
            throw new ParkingLotNotFoundException("Parking Lot not found with id : " + parkingLotId);
        }

        return parkingLot;
    }

    public void put(ParkingLot parkingLot){
        parkingLot.setId(++idCounter);
        parkingLotRepository.put(parkingLot.getId(), parkingLot);
        System.out.println("Parking Lot has been added successfully!");
    }

}
