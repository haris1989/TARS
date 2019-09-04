//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.04 at 12:26:29 AM PDT 
//


package com.example.webfluxdemo.schemas.inspection;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.webfluxdemo.schemas.inspection package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.webfluxdemo.schemas.inspection
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartProcess }
     * 
     */
    public StartProcess createStartProcess() {
        return new StartProcess();
    }

    /**
     * Create an instance of {@link InspectionRequest }
     * 
     */
    public InspectionRequest createInspectionRequest() {
        return new InspectionRequest();
    }

    /**
     * Create an instance of {@link StartProcessResponse }
     * 
     */
    public StartProcessResponse createStartProcessResponse() {
        return new StartProcessResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ViolationInfoBO }
     * 
     */
    public ViolationInfoBO createViolationInfoBO() {
        return new ViolationInfoBO();
    }

    /**
     * Create an instance of {@link CustomerInfoBO }
     * 
     */
    public CustomerInfoBO createCustomerInfoBO() {
        return new CustomerInfoBO();
    }

    /**
     * Create an instance of {@link VehicleInfoBO }
     * 
     */
    public VehicleInfoBO createVehicleInfoBO() {
        return new VehicleInfoBO();
    }

}