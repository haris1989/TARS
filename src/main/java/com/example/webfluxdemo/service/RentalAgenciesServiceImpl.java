package com.example.webfluxdemo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.webfluxdemo.entity.RentalAgencies;
import com.example.webfluxdemo.repository.RentalAgenciesRepository;

@Service
public class RentalAgenciesServiceImpl implements RentalAgenciesService {
	@Autowired
	RentalAgenciesRepository rar;

	@Override
	public void add(RentalAgencies ra) {
		rar.save(ra);
	}
}
