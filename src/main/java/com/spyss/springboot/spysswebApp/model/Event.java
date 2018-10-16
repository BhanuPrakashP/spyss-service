package com.spyss.springboot.spysswebApp.model;

import java.io.Serializable;
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
@EqualsAndHashCode(exclude ="eventId")
public class Event implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Setter(AccessLevel.PRIVATE)
	private Long eventId;
	
	@NotNull(message="{errors.required}")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate eventDate;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=30, message="{errors.range}")
	private String title;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=30, message="{errors.range}")
	private String location;
	
	public Event() {
		this.eventDate = LocalDate.now();
	}
		
	@NotNull(message="{errors.required}")
	@Size(min=5, max=150, message="{errors.range}")
	private String shortDescription;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=800, message="{errors.range}")
	private String fullDescription;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private String eventHashTag;
	
	@NotNull(message="{errors.required}")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalTime eventStartTime;
	
	@NotNull(message="{errors.required}")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalTime eventEndTime;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=200, message="{errors.range}")
	private String targetAudience;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=200, message="{errors.range}")
	private String agenda;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=3000, message="{errors.range}")
	private String instructionsForIYC;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=3000, message="{errors.range}")
	private String instructionsForNYC;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=3000, message="{errors.range}")
	private String instructionsForOthers;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=300, message="{errors.range}")
	private String eligibilityCriteria;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=1000, message="{errors.range}")
	private String locationDescription;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=100, message="{errors.range}")
	private String address;	
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=100, message="{errors.range}")
	private String googleLocationLink;

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public String getEventHashTag() {
		return eventHashTag;
	}

	public void setEventHashTag(String eventHashTag) {
		this.eventHashTag = eventHashTag;
	}

	public LocalTime getEventStartTime() {
		return eventStartTime;
	}

	public void setEventStartTime(LocalTime eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	public LocalTime getEventEndTime() {
		return eventEndTime;
	}

	public void setEventEndTime(LocalTime eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String getInstructionsForIYC() {
		return instructionsForIYC;
	}

	public void setInstructionsForIYC(String instructionsForIYC) {
		this.instructionsForIYC = instructionsForIYC;
	}

	public String getInstructionsForNYC() {
		return instructionsForNYC;
	}

	public void setInstructionsForNYC(String instructionsForNYC) {
		this.instructionsForNYC = instructionsForNYC;
	}

	public String getInstructionsForOthers() {
		return instructionsForOthers;
	}

	public void setInstructionsForOthers(String instructionsForOthers) {
		this.instructionsForOthers = instructionsForOthers;
	}

	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}

	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGoogleLocationLink() {
		return googleLocationLink;
	}

	public void setGoogleLocationLink(String googleLocationLink) {
		this.googleLocationLink = googleLocationLink;
	}
	
}
