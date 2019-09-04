package com.example.webfluxdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webfluxdemo.common.ApplicationProperty;
import com.example.webfluxdemo.schemas.inspection.StartProcess;
import com.example.webfluxdemo.schemas.inspection.StartProcessResponse;
import com.example.webfluxdemo.springbootsoapclient.SOAPConnector;

@Service
public class InspectionBPMServiceImpl implements InspectionBpmService {
	@Autowired
	ApplicationProperty applicationProperty;

	@Autowired
	SOAPConnector soapConnector;

	@Override
	public StartProcessResponse verifyBuisnessProcess(StartProcess request) {
		StartProcessResponse InspectionResponse = (StartProcessResponse) soapConnector
				.callWebService(applicationProperty.getServiceUri(), request);
		System.out.println("Got Response As below ========= : ");
		System.out.println("Code : " + InspectionResponse.getResponse().getResponseCode());
		System.out.println("Description : " + InspectionResponse.getResponse().getResponseDescription());
		return InspectionResponse;
	}

}
