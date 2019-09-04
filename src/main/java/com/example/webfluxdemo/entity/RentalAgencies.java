package com.example.webfluxdemo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tars_Rental_Agency_1")
public class RentalAgencies {
	@Id
	@Column(name = "id", updatable = false, nullable = false)
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "permit_type")
	private String rentalAgencyPermitType;
	
	private String rentalAgencyPermitStart;
	
	private String rentalAgencyPermitEnd;
	
	public RentalAgencies() {};
	
	public RentalAgencies(String id, String name, String address, String rentalAgencyPermitType,
			String rentalAgencyPermitStart, String rentalAgencyPermitEnd) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.rentalAgencyPermitType = rentalAgencyPermitType;
		this.rentalAgencyPermitStart = rentalAgencyPermitStart;
		this.rentalAgencyPermitEnd = rentalAgencyPermitEnd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRentalAgencyPermitType() {
		return rentalAgencyPermitType;
	}

	public void setRentalAgencyPermitType(String rentalAgencyPermitType) {
		this.rentalAgencyPermitType = rentalAgencyPermitType;
	}

	public String getRentalAgencyPermitStart() {
		return rentalAgencyPermitStart;
	}

	public void setRentalAgencyPermitStart(String rentalAgencyPermitStart) {
		this.rentalAgencyPermitStart = rentalAgencyPermitStart;
	}

	public String getRentalAgencyPermitEnd() {
		return rentalAgencyPermitEnd;
	}

	public void setRentalAgencyPermitEnd(String rentalAgencyPermitEnd) {
		this.rentalAgencyPermitEnd = rentalAgencyPermitEnd;
	}
}
