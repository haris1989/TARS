package com.example.webfluxdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.webfluxdemo.entity.Contract;

@Repository
public interface TarsTransactionVehicleContractRepository
		extends CrudRepository<Contract, Integer> {

}
