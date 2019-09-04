package com.example.webfluxdemo.controller;
import java.util.ArrayList;
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

import com.example.webfluxdemo.entity.RentalAgencies;
import com.example.webfluxdemo.service.BlockChainService;
import com.example.webfluxdemo.service.BpmService;
import com.example.webfluxdemo.service.OdmService;
import com.example.webfluxdemo.service.RentalAgenciesService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("api/RentalAgencies")
public class RentalAgenciesController {
	@Autowired
	RentalAgenciesService ras;
	@Autowired
	OdmService odmService;
	@Autowired
	BpmService bs;
	@Autowired
	BlockChainService bcs;
	@GetMapping(path = "")
	public List<RentalAgencies> provideData() {
		List<RentalAgencies> raList = new ArrayList<RentalAgencies>();

		return raList;
	}


	@CrossOrigin(origins = "*")
	@PostMapping(path = "", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> add(@RequestBody RentalAgencies ra) {
		String response="";
		ResponseEntity responseEntity = null;
		Map<String, Map<String,Boolean>> result = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			String objtoJson = mapper.writeValueAsString(ra);
			System.out.println(objtoJson);
			response = bcs.postToBlockChain(objtoJson, "/api/org.techvista.rta.tars.RentalAgencies");
			result = mapper.readValue(response, Map.class);
			if(!result.containsKey("error")) {
				ras.add(ra);
				responseEntity = new ResponseEntity<>(response,HttpStatus.OK);
			}
			

		}
		catch(Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return responseEntity;
	}
}
