package com.example.webfluxdemo.service;

import com.example.webfluxdemo.entity.Contract;
import com.example.webfluxdemo.schemas.inspection.StartProcessResponse;

public interface BpmService {
	public StartProcessResponse executeBpm(Contract contract);

}
