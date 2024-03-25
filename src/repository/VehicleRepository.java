package repository;

import exception.VehicleNotFoundException;
import models.Vehicle;

import java.util.HashMap;

public class VehicleRepository {
    private HashMap<Integer, Vehicle> vehicleRepository;

    public VehicleRepository(){
        vehicleRepository = new HashMap<>();
    }

    public void put(Vehicle vehicle){
        vehicleRepository.put(vehicle.getId(), vehicle);
        System.out.println("Vehicle has been added successfully!");
    }

    public Vehicle get(int vehicleId){
        Vehicle vehicle = vehicleRepository.get(vehicleId);
        if(vehicle == null){
            throw new VehicleNotFoundException("Invalid vehicle number given, vehicle is not present!!!");
        }

        return vehicle;
    }
}
