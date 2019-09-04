/**
 * @author umar.tahir
 */
package com.example.webfluxdemo.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperty {

	@Value("${inspectionbpm.service.uri}")
	private String serviceUri;

	@Value("${inspectionbpm.service.contextpath}")
	private String serviceContext;

	public String getServiceUri() {
		return serviceUri;
	}

	public String getServiceContext() {
		return serviceContext;
	}

}
