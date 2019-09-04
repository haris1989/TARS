/**
 * @author umar.tahir
 */
package com.example.webfluxdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.example.webfluxdemo.common.ApplicationProperty;
import com.example.webfluxdemo.springbootsoapclient.SOAPConnector;

@Configuration
public class BPMSoapRequestConfig {

	@Autowired
	ApplicationProperty applicationProperty;

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath(applicationProperty.getServiceContext());
		return marshaller;
	}

	@Bean
	public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
		SOAPConnector client = new SOAPConnector();
		client.setDefaultUri(applicationProperty.getServiceUri());
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}