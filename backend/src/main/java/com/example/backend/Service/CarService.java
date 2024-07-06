package com.example.backend.Service;

import com.example.backend.Controller.request.CarPageRequest;
import com.example.backend.Entity.Car;

import java.util.List;

public interface CarService {

    List<Car> SelectCars();
    List<Integer> SelectcarStatus();
    List<Integer> InsertcarStatus(Integer carStatus);
    Object page(CarPageRequest carPageRequest);

    void deleteCar(String id);

    void updateCar(Car car);

    void addCar(Car car);
}
