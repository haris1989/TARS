package com.example.webfluxdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tars_Vehicle3")
public class Vehicle {
	@Id
	@Column(name = "id", updatable = false, nullable = false)
	private String id;

	@Column(name = "vehicle_name")
	private String vehicleName;

	@Column(name = "vehicle_model")
	private String vehicleModel;

	private String rentalAgency;

	@Column(name = "manufacture_date")
	private String vehicleDateOfManufacture;

	@Column(name = "company_name")
	private String vehicleInsuranceCompanyName;

	@Column(name = "insurance_type")
	private String vehicleInsuranceType;

	@Column(name = "insurance_start")
	private String vehicleInsuranceStart;

	@Column(name = "insurance_end")
	private String vehicleInsuranceEnd;

	public String getRentalAgency() {
		return rentalAgency;
	}

	public void setRentalAgency(String rentalAgency) {
		this.rentalAgency = rentalAgency;
	}


	public Vehicle()
	{

	}

	public Vehicle(String id, String vehicleName, String vehicleModel, String vehicleDateOfManufacture,
			String vehicleInsuranceCompanyName, String vehicleInsuranceType, String vehicleInsuranceStart,
			String vehicleInsuranceEnd, String customerIDProof,
			String customerVehicleContractStart, String customerVehicleContractEnd, Integer totalCost,
			Integer durationInDays, String rentalAgency) {

		this.id = id;
		this.vehicleName = vehicleName;
		this.vehicleModel = vehicleModel;
		this.vehicleDateOfManufacture = vehicleDateOfManufacture;
		this.vehicleInsuranceCompanyName = vehicleInsuranceCompanyName;
		this.vehicleInsuranceType = vehicleInsuranceType;
		this.vehicleInsuranceStart = vehicleInsuranceStart;
		this.vehicleInsuranceEnd = vehicleInsuranceEnd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleDateOfManufacture() {
		return vehicleDateOfManufacture;
	}

	public void setVehicleDateOfManufacture(String vehicleDateOfManufacture) {
		this.vehicleDateOfManufacture = vehicleDateOfManufacture;
	}

	public String getVehicleInsuranceCompanyName() {
		return vehicleInsuranceCompanyName;
	}

	public void setVehicleInsuranceCompanyName(String vehicleInsuranceCompanyName) {
		this.vehicleInsuranceCompanyName = vehicleInsuranceCompanyName;
	}

	public String getVehicleInsuranceType() {
		return vehicleInsuranceType;
	}

	public void setVehicleInsuranceType(String vehicleInsuranceType) {
		this.vehicleInsuranceType = vehicleInsuranceType;
	}

	public String getVehicleInsuranceStart() {
		return vehicleInsuranceStart;
	}

	public void setVehicleInsuranceStart(String vehicleInsuranceStart) {
		this.vehicleInsuranceStart = vehicleInsuranceStart;
	}

	public String getVehicleInsuranceEnd() {
		return vehicleInsuranceEnd;
	}

	public void setVehicleInsuranceEnd(String vehicleInsuranceEnd) {
		this.vehicleInsuranceEnd = vehicleInsuranceEnd;
	}


}
