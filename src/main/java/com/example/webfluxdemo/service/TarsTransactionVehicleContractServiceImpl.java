package com.example.webfluxdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webfluxdemo.entity.Contract;
import com.example.webfluxdemo.repository.TarsTransactionVehicleContractRepository;

@Service
public class TarsTransactionVehicleContractServiceImpl implements TarsTransactionVehicleContractService {

	@Autowired
	TarsTransactionVehicleContractRepository tvcrr;

	@Override
	public void add(Contract tvcr) {

		tvcrr.save(tvcr);

	}

}
