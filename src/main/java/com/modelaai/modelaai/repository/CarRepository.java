package com.modelaai.modelaai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelaai.modelaai.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
