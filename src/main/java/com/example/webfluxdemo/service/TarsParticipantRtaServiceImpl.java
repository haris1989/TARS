package com.example.webfluxdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webfluxdemo.entity.TarsParticipantRta;
import com.example.webfluxdemo.repository.TarsParticipantRtaRepository;

@Service
public class TarsParticipantRtaServiceImpl implements TarsParticipantRtaService{

	@Autowired
	TarsParticipantRtaRepository tPrr;
	
	@Override
	public void add(TarsParticipantRta tPr) {
		
		tPrr.save(tPr);
		
	}

	
}
