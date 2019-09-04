//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.04 at 12:26:29 AM PDT 
//


package com.example.webfluxdemo.schemas.inspection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleInfoBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleInfoBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plateNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleLicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInsuranceEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInsuranceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInsuranceStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInsuranceCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleDateOfManufacture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleInfoBO", propOrder = {
    "brand",
    "model",
    "color",
    "plateNum",
    "vehicleLicenseNum",
    "vehicleInsuranceEnd",
    "vehicleInsuranceType",
    "vehicleInsuranceStart",
    "vehicleInsuranceCompanyName",
    "vehicleDateOfManufacture"
})
public class VehicleInfoBO {

    protected String brand;
    protected String model;
    protected String color;
    protected String plateNum;
    protected String vehicleLicenseNum;
    protected String vehicleInsuranceEnd;
    protected String vehicleInsuranceType;
    protected String vehicleInsuranceStart;
    protected String vehicleInsuranceCompanyName;
    protected String vehicleDateOfManufacture;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the plateNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNum() {
        return plateNum;
    }

    /**
     * Sets the value of the plateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNum(String value) {
        this.plateNum = value;
    }

    /**
     * Gets the value of the vehicleLicenseNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleLicenseNum() {
        return vehicleLicenseNum;
    }

    /**
     * Sets the value of the vehicleLicenseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleLicenseNum(String value) {
        this.vehicleLicenseNum = value;
    }

    /**
     * Gets the value of the vehicleInsuranceEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleInsuranceEnd() {
        return vehicleInsuranceEnd;
    }

    /**
     * Sets the value of the vehicleInsuranceEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleInsuranceEnd(String value) {
        this.vehicleInsuranceEnd = value;
    }

    /**
     * Gets the value of the vehicleInsuranceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleInsuranceType() {
        return vehicleInsuranceType;
    }

    /**
     * Sets the value of the vehicleInsuranceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleInsuranceType(String value) {
        this.vehicleInsuranceType = value;
    }

    /**
     * Gets the value of the vehicleInsuranceStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleInsuranceStart() {
        return vehicleInsuranceStart;
    }

    /**
     * Sets the value of the vehicleInsuranceStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleInsuranceStart(String value) {
        this.vehicleInsuranceStart = value;
    }

    /**
     * Gets the value of the vehicleInsuranceCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleInsuranceCompanyName() {
        return vehicleInsuranceCompanyName;
    }

    /**
     * Sets the value of the vehicleInsuranceCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleInsuranceCompanyName(String value) {
        this.vehicleInsuranceCompanyName = value;
    }

    /**
     * Gets the value of the vehicleDateOfManufacture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleDateOfManufacture() {
        return vehicleDateOfManufacture;
    }

    /**
     * Sets the value of the vehicleDateOfManufacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleDateOfManufacture(String value) {
        this.vehicleDateOfManufacture = value;
    }

}