package com.example.webfluxdemo.controller;
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

import com.example.webfluxdemo.dto.TarsTransactionVehicleContractDto;
import com.example.webfluxdemo.schemas.inspection.StartProcessResponse;
import com.example.webfluxdemo.service.BlockChainService;
import com.example.webfluxdemo.service.BpmService;
import com.example.webfluxdemo.service.OdmService;
import com.example.webfluxdemo.service.TarsTransactionVehicleContractService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("api/RentalContract")
public class TarsTransactionVehicleContractController {
	@Autowired
	TarsTransactionVehicleContractService tvcs;
	@Autowired
	OdmService odmService;
	@Autowired
	BpmService bs;
	@Autowired
	BlockChainService bcs;
	@GetMapping(path = "")
	public void provideData() {
		//		List<TarsTransactionVehicleContract> tprList = new ArrayList<TarsTransactionVehicleContract>();
		//		TarsTransactionVehicleContract tpr = new TarsTransactionVehicleContract();

		//tpr.setId(1);
		//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
		//		tpr.setCustomerVehicleContractStart(LocalDate.parse("20-08-2019", formatter));
		//		tpr.setCustomerVehicleContractEnd(LocalDate.parse("25-08-2019", formatter));
		//		tpr.setTotalCost(250.00);
		//		tpr.setCustomerIDType("Emirates Id");
		//		tpr.setCustomerName("Chitresh Dayal");
		//		tpr.setSalik(0);
		//		tpr.setFine(0);
		//		tpr.setCheckImmigrationEligibility(false);
		//		tpr.setContractStatus("Open");
		//		tpr.setContractId(1);
		//
		//		tprList.add(tpr);
		//		tprList.add(tpr);
		//
		//		return tprList;
	}

	@CrossOrigin(origins = "*")
	@PostMapping(path = "", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> add(@RequestBody TarsTransactionVehicleContractDto tvrc) {
		ResponseEntity responseEntity = null;
		String odmRequestObj= "{}";
		Boolean odmResponse =false;
		String response="";
		Boolean runOdmService = false; 
		//Skipping this part it the violation code and type are null
		if(!tvrc.getContract().getViolationCode().equalsIgnoreCase("N/A")) {
			odmRequestObj="{\r\n" + 
					"	\"request\":{\r\n" + 
					"	\"violationType\" : \""+tvrc.getContract().getViolationType().toString()+"\",\r\n" + 
					"	\"violationCode\" : \""+tvrc.getContract().getViolationCode()+"\"\r\n" + 
					"	}\r\n" + 
					"	\r\n" + 
					"}";
			runOdmService = true;
		}

		
		Map<String, Map<String,Boolean>> result = null;
		try {
			
			if(runOdmService&&odmService.getResponse(odmRequestObj)) {
				////To be Dicussed////
				StartProcessResponse  inspectionResponse = bs.executeBpm(tvrc.getContract());
				if(inspectionResponse.getResponse().getResponseCode().equals("0")&&inspectionResponse.getResponse().getResponseDescription().equals("Active")) {
				tvrc.getContract().setIsInspectionInProgress("true");
			
				}
				else {
					tvrc.getContract().setIsInspectionInProgress("false");
				}
				
				
				ObjectMapper mapper = new ObjectMapper();
				String objtoJson = mapper.writeValueAsString(tvrc);
     			response = bcs.postToBlockChain(objtoJson, "/api/org.techvista.rta.tars.RentalContract");
			
				result = mapper.readValue(response, Map.class);
				
				if(!result.containsKey("error")) {
				tvcs.add(tvrc.getContract());
				responseEntity = new ResponseEntity<>(response,HttpStatus.OK);
				}
			}
			else {
				ObjectMapper mapper = new ObjectMapper();
				String objtoJson = mapper.writeValueAsString(tvrc);
				System.out.println(objtoJson);
				
				
				response = bcs.postToBlockChain(objtoJson, "/api/org.techvista.rta.tars.RentalContract");
				result = mapper.readValue(response, Map.class);
				if(!result.containsKey("error")) {
				tvcs.add(tvrc.getContract());
				responseEntity = new ResponseEntity<>(response,HttpStatus.OK);
				}
				
			}


		}
		catch(Exception e) {
			responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		 return responseEntity;
	}
}
