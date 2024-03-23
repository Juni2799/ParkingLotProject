package models;

import models.Enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;
    private List<Gate> gates;
    private ParkingFloorStatus parkingFloorStatus;

    public ParkingFloor(){}

    public ParkingFloor(List<ParkingSpot> parkingSpots, int floorNumber, List<Gate> gates, ParkingFloorStatus parkingFloorStatus) {
        this.parkingSpots = parkingSpots;
        this.floorNumber = floorNumber;
        this.gates = gates;
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
