package com.spyss.springboot.spysswebApp.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Entity
@Data
@EqualsAndHashCode(exclude ="branchId")
public class Branch {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Setter(AccessLevel.PRIVATE)
	private Long branchId;
	
	@NotNull(message="{errors.required}")
	@DateTimeFormat(iso=ISO.TIME)
	private LocalTime batchTimings;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=25, message="{errors.range}")
	private String branchName;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=50, message="{errors.range}")
	private String address;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private String country;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private String state;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private String city;
	
	@NotNull(message="{errors.required}")
	@Size(min=6, max=14, message="{errors.range}")
	private Long contactNumber;

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public LocalTime getBatchTimings() {
		return batchTimings;
	}

	public void setBatchTimings(LocalTime batchTimings) {
		this.batchTimings = batchTimings;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
}
