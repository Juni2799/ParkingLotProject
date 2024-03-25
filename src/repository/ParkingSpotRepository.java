package repository;

import exception.ParkingSpotNotFoundException;
import models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Integer, ParkingSpot> parkingSpotRepository;

    public ParkingSpotRepository() {
        this.parkingSpotRepository = new HashMap<>();
    }

    public ParkingSpot get(int parkingSpotId){
        ParkingSpot parkingSpot = parkingSpotRepository.get(parkingSpotId);
        if(parkingSpot == null){
            throw new ParkingSpotNotFoundException("ParkingSpot not found for id : " + parkingSpotId);
        }
        return parkingSpot;
    }

    public void put(ParkingSpot parkingSpot){
        parkingSpotRepository.put(parkingSpot.getId(), parkingSpot);
        System.out.println("ParkingSpot has been added successfully");
    }
}
