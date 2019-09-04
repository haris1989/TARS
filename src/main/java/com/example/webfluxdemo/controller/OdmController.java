package com.example.webfluxdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webfluxdemo.service.InspectionBpmService;

@RestController
@RequestMapping("api/odm")
public class OdmController {
	

	@Autowired
	InspectionBpmService service;


	@PostMapping(path = "/inspectionrequired")
	public boolean inspectionRequired(@RequestBody String odmRequestObj) {
		
//		Boolean inspectionRequired = false;
//		
//		inspectionRequired = odmService.getResponse(odmRequestObj);
//
//		return inspectionRequired;
		
		return true;
	}

}
