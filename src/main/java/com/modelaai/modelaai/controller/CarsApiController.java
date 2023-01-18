package com.modelaai.modelaai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.modelaai.dto.CarDTO;
import com.modelaai.modelaai.model.Car;
import com.modelaai.modelaai.repository.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarsApiController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> listAllCars(){
        return repository.findAll();
    }

    @PostMapping
    public void createCar(@RequestBody CarDTO req) {
        repository.save(new Car(req));
    }
}