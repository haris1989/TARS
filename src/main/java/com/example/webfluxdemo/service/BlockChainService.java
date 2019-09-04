package com.example.webfluxdemo.service;

public interface BlockChainService {
	
	public String postToBlockChain(String requestJsonBody, String uriEndPoint);
	public String invokeRestClient(String requestJsonBody, String uriEndPoint);

}
