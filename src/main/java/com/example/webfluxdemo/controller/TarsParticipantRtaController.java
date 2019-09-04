package com.example.webfluxdemo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webfluxdemo.entity.TarsParticipantRta;
import com.example.webfluxdemo.schemas.inspection.StartProcessResponse;
import com.example.webfluxdemo.service.BpmService;
import com.example.webfluxdemo.service.TarsParticipantRtaService;


@RestController
@RequestMapping("api/Rta")
public class TarsParticipantRtaController {

	@Autowired
	TarsParticipantRtaService tprs;
	@Autowired
	BpmService bs;
	@GetMapping(path = "")
	public TarsParticipantRta provideData() {
		TarsParticipantRta tpr = new TarsParticipantRta();

		tpr.setName("abc");
		tpr.setAddress("xyz");
		//tpr.setId(123);

		return tpr;
	}

	@PostMapping(path = "", consumes = "application/json", produces = "application/json")
	public String add(@RequestBody TarsParticipantRta tpr) {
		String response ="";
		StartProcessResponse inspectionResponse = null;
		try {
		//	inspectionResponse = bs.executeBpm();
		//	if(inspectionResponse.getResponse().getResponseCode().equals("0")&&inspectionResponse.getResponse().getResponseDescription().equals("Active")) {
				tprs.add(tpr);
				response = "Posted";
//			}
//			else {
//
//				response = "Something went wrong when starting BMP";
//
//			}

		}
		catch(Exception e) {
			response = e.getMessage();
		}

		return response;
	}
}
