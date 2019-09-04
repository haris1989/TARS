package com.example.webfluxdemo.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webfluxdemo.entity.Vehicle;
import com.example.webfluxdemo.service.BlockChainService;
import com.example.webfluxdemo.service.VehicleService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("api/Vehicle")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	@Autowired
	BlockChainService bcs;
	@GetMapping("")
	public List<Vehicle> getAllVehicles() {
		return null;
	}


	@CrossOrigin(origins = "*")
	@PostMapping(path = "", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle) {
		String response = "";
		ResponseEntity responseEntity = null;
		Map<String, Map<String,Boolean>> result = null;
		try{
			ObjectMapper mapper = new ObjectMapper();
			String objtoJson = mapper.writeValueAsString(vehicle);
			System.out.println(objtoJson);
			response = bcs.postToBlockChain(objtoJson, "/api/org.techvista.rta.tars.Vehicle");
			result = mapper.readValue(response, Map.class);
			if(!result.containsKey("error")) {
			vehicleService.add(vehicle);
			responseEntity = new ResponseEntity<>(response,HttpStatus.OK);
		}
		}
		catch(Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return responseEntity;
	}
}
