package com.example.backend.Service;

import com.example.backend.Controller.request.MachinePageRequest;
import com.example.backend.Entity.Machine;

import java.util.List;

public interface MachineService {
    void deleteMachine(String id);

    void updateMachine(Machine machine);

    void addMachine(Machine machine);

    List<Machine> SelectMachines();

    Object page(MachinePageRequest machinePageRequest);
}
