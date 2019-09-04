package com.example.webfluxdemo.dto;

import com.example.webfluxdemo.entity.Contract;

public class TarsTransactionVehicleContractDto {
	public Contract contract;

	public void setContract(Contract contract) {
		this.contract = contract;
		
	}
	
	public Contract getContract() {
		return contract;
		
	}
}
