package models;

import models.Enums.VehicleType;

public class Vehicle extends BaseModel {
    private String vehicleNo;
    private VehicleType vehicleType;
    private String color;

    public Vehicle(){}

    public Vehicle(String vehicleNo, VehicleType vehicleType, String color) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.color = color;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
