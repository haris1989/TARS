/**
 * @author umar.tahir
 */

package com.example.webfluxdemo.springbootsoapclient;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

public class SOAPConnector extends WebServiceGatewaySupport {

	public Object callWebService(String url, Object request) {
		SaajSoapMessageFactory newMessageFactory = new SaajSoapMessageFactory();
		newMessageFactory.setSoapVersion(SoapVersion.SOAP_12);
		newMessageFactory.afterPropertiesSet();
		WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
		webServiceTemplate.setMessageFactory(newMessageFactory);
		return getWebServiceTemplate().marshalSendAndReceive(url, request);
	}
}