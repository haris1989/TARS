package com.example.webfluxdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.webfluxdemo.entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
