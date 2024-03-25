package controllers;

import models.ParkingLot;
import service.strategy.InitService;

public class InitController {
    private InitService initService;

    public InitController(InitService initService) {
        this.initService = initService;
    }

    public ParkingLot generateData(){
        return initService.init();
    }
}
