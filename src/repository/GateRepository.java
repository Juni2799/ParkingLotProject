package repository;

import exception.GateNotFoundException;
import models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateRepository;

    public GateRepository() {
        this.gateRepository = new HashMap<>();
    }

    public Gate get(int gateId){
        Gate gate = gateRepository.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("Gate not found for id : " + gateId);
        }
        return gate;
    }

    public void put(Gate gate){
        gateRepository.put(gate.getId(), gate);
        System.out.println("gate has been added successfully");
    }
}
