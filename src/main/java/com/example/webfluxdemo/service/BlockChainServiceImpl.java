package com.example.webfluxdemo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BlockChainServiceImpl implements BlockChainService {
	
	@Value("${blockchain.path}")
	private String blockchain;


	@Override
	public String postToBlockChain(String requestJsonBody, String uriEndPoint) {
		String body="";
//		try {
//			RestTemplate restTemplate = new RestTemplate();
//			
//			HttpHeaders headers = new HttpHeaders();
//			headers.setContentType(MediaType.APPLICATION_JSON);
//			HttpEntity<String> entity = new HttpEntity<String>(requestJsonBody, headers);
//			String uri = blockchain+uriEndPoint;
//			ResponseEntity<String> response = restTemplate.postForEntity(uri, entity, String.class);
//			
//			
//			if (response.getStatusCode().equals(HttpStatus.OK)) {
//
//				body = response.getBody();
//
//			}
//		}
//
//		catch (Exception e) {
//			
//			e.printStackTrace();
//			body = e.getMessage();
//
//		}
//		System.out.println(body);
		return invokeRestClient(requestJsonBody, uriEndPoint) ;
		
	}
	
	public String invokeRestClient(String requestJsonBody, String uriEndPoint) {
		

		String returnOutput="";
		String output=null;
		try {
			String uri = blockchain+uriEndPoint;
			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost postRequest = new HttpPost(uri);

			StringEntity input = new StringEntity(requestJsonBody);
			input.setContentType("application/json");
			postRequest.setEntity(input);

			HttpResponse response = httpClient.execute(postRequest);


			BufferedReader br = new BufferedReader(new InputStreamReader(
					(response.getEntity().getContent())));

			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				returnOutput = returnOutput+output;
				System.out.println(output);
			}
			
			if (response.getStatusLine().getStatusCode() == 500) {
				throw new RuntimeException(returnOutput);
			}

			httpClient.getConnectionManager().shutdown();

		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();

		}

		return returnOutput;
	}
}
