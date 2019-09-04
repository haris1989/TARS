package com.example.webfluxdemo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webfluxdemo.entity.Vehicle;
import com.example.webfluxdemo.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleRepository vr;

	@Override
	public void add(Vehicle v) {
		vr.save(v);
	}
}
