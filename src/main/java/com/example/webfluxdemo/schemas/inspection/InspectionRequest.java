//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.24 at 11:59:10 PM PDT 
//


package com.example.webfluxdemo.schemas.inspection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InspectionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InspectionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerInfo" type="{http://TARS/InspectionWS.tws}CustomerInfoBO" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInfo" type="{http://TARS/InspectionWS.tws}VehicleInfoBO" minOccurs="0"/&gt;
 *         &lt;element name="violationInfo" type="{http://TARS/InspectionWS.tws}ViolationInfoBO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InspectionRequest", propOrder = {
    "customerInfo",
    "vehicleInfo",
    "violationInfo"
})
public class InspectionRequest {

    protected CustomerInfoBO customerInfo;
    protected VehicleInfoBO vehicleInfo;
    protected ViolationInfoBO violationInfo;

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoBO }
     *     
     */
    public CustomerInfoBO getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoBO }
     *     
     */
    public void setCustomerInfo(CustomerInfoBO value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleInfoBO }
     *     
     */
    public VehicleInfoBO getVehicleInfo() {
        return vehicleInfo;
    }

    /**
     * Sets the value of the vehicleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInfoBO }
     *     
     */
    public void setVehicleInfo(VehicleInfoBO value) {
        this.vehicleInfo = value;
    }

    /**
     * Gets the value of the violationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ViolationInfoBO }
     *     
     */
    public ViolationInfoBO getViolationInfo() {
        return violationInfo;
    }

    /**
     * Sets the value of the violationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViolationInfoBO }
     *     
     */
    public void setViolationInfo(ViolationInfoBO value) {
        this.violationInfo = value;
    }

}
