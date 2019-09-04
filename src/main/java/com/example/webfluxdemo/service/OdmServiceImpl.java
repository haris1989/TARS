package com.example.webfluxdemo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OdmServiceImpl implements OdmService {
	
	@Value("${odmUrl.path}")
	private String odmUrl;

	@Override
	public boolean getResponse(String odmRequestObj) {
		
		Map<String, Map<String,Boolean>> result = null;
		boolean inspectionRequired = false;
		try {

			ObjectMapper mapper = new ObjectMapper();
			RestTemplate restTemplate = new RestTemplate();
			
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<String>(odmRequestObj, headers);
			ResponseEntity<String> response = restTemplate.postForEntity(odmUrl, entity, String.class);
			
			
			if (response.getStatusCode().equals(HttpStatus.OK)) {

				result = mapper.readValue(response.getBody(), Map.class);
				Map<String, Boolean> finalValue = result.get("response");

				inspectionRequired = finalValue.get("inspectionRequired");

			}
		}

		catch (Exception e) {

			e.printStackTrace();

		}

		return inspectionRequired;
	}
	
	
	
}
