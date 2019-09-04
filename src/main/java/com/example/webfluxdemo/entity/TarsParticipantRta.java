package com.example.webfluxdemo.entity;

import javax.persistence.*;


@Entity
@Table(name = "Tars_Pr1")
public class TarsParticipantRta {
	 
	@Id
	@Column(name = "id", updatable = false, nullable = false)
	private String id;
	
	@Column(name = "class")
	private String $class;
	
	String name;
	
	String address;

	public String get$class() {
		return $class;
	}

	public void set$class(String $class) {
		this.$class = $class;
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
	
	@Override
	public String toString() {
		return "TarsParticipantRta [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
