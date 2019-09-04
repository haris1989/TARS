package com.example.webfluxdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
@Entity
@Table(name = "Tars_contract1")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contract {
	@Id
	@Column(name = "id", updatable = false, nullable = false)
	private String id;
	
	@Column(name = "class")
	private String $class;

	public String get$class() {
		return $class;
	}

	public void set$class(String $class) {
		this.$class = $class;
	}

	private String customerName;

	private Integer contractId;

	private Integer customerIDNumber;

	private String telematicsData;

	private String customerIDType;

	@Column(name = "startDate")
	private String customerVehicleContractStart;

	@Column(name = "endDate")
	private String customerVehicleContractEnd;

	private Double totalCost;

	private Double salik;

	private Double fine;

	@Column(name = "cie")
	private String checkImmigrationEligibility;

	private String contractStatus;

	@Column(name="inp")
	private String isInspectionInProgress;

	private String transactionId;

	private String timestamp;

	private String violationType;

	private String violationCode;

	private String vehicle;

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getIsInspectionInProgress() {
		return isInspectionInProgress;
	}

	public void setIsInspectionInProgress(String isInspectionInProgress) {
		this.isInspectionInProgress = isInspectionInProgress;
	}

	public String getViolationType() {
		return violationType;
	}

	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}

	public String getViolationCode() {
		return violationCode;
	}

	public void setViolationCode(String violationCode) {
		this.violationCode = violationCode;
	}



	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public Double getSalik() {
		return salik;
	}

	public void setSalik(Double salik) {
		this.salik = salik;
	}

	public Double getFine() {
		return fine;
	}

	public void setFine(Double fine) {
		this.fine = fine;
	}

	public String getCheckImmigrationEligibility() {
		return checkImmigrationEligibility;
	}

	public void setCheckImmigrationEligibility(String checkImmigrationEligibility) {
		this.checkImmigrationEligibility = checkImmigrationEligibility;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerVehicleContractStart() {
		return customerVehicleContractStart;
	}

	public void setCustomerVehicleContractStart(String customerVehicleContractStart) {
		this.customerVehicleContractStart = customerVehicleContractStart;
	}

	public String getCustomerVehicleContractEnd() {
		return customerVehicleContractEnd;
	}

	public void setCustomerVehicleContractEnd(String customerVehicleContractEnd) {
		this.customerVehicleContractEnd = customerVehicleContractEnd;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCustomerIDNumber() {
		return customerIDNumber;
	}

	public void setCustomerIDNumber(Integer customerIDNumber) {
		this.customerIDNumber = customerIDNumber;
	}

	public String getTelematicsData() {
		return telematicsData;
	}

	public void setTelematicsData(String telematicsData) {
		this.telematicsData = telematicsData;
	}

	public String getCustomerIDType() {
		return customerIDType;
	}

	public void setCustomerIDType(String customerIDType) {
		this.customerIDType = customerIDType;
	}
}
