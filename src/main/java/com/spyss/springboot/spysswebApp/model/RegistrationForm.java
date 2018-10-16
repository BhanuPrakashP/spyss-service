package com.spyss.springboot.spysswebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class RegistrationForm {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)	
	@Setter(AccessLevel.PRIVATE)
	private Long registrationNo;

	@NotNull(message="{errors.required}")
	@Size(min=5, max=30, message="{errors.range}")
	private String firstName;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=30, message="{errors.range}")
	private String middleName;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=30, message="{errors.range}")
	private String lastName;
	
	@NotNull(message="{errors.required}")	
	private int age;
	
	@NotNull(message="{errors.required}")
	@Size(min=4, max=8, message="{errors.range}")
	private String gender;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=30, message="{errors.range}")
	private String email;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private String highestQualification;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private String profession;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private String countryOfOrigin;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private String Nationality;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=100, message="{errors.range}")
	private String residentialAddress;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=15, message="{errors.range}")
	private String passportNumber;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=50, message="{errors.range}")
	private String languagesKnown;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private Long PrimaryContactNumber;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private Long whatsAppContactNumber;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=20, message="{errors.range}")
	private Long alternateContactNumber;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=15, message="{errors.range}")
	private String travellingFrom;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=30, message="{errors.range}")
	private String passportCopy;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=30, message="{errors.range}")
	private String latestPhoto;
	
	@NotNull(message="{errors.required}")	
	private Boolean practicingYoga;
	
	@NotNull(message="{errors.required}")	
	private Boolean practicingWithSpyss;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=15, message="{errors.range}")
	private String howDidYouKnow;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=15, message="{errors.range}")
	private String branchOfPractice;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=15, message="{errors.range}")
	private String mainTeacherName;
	
	@NotNull(message="{errors.required}")	
	private Boolean attendedSpyssCampsBefore;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=30, message="{errors.range}")
	private String countriesTravelled;
	
	@Size(min=5, max=30, message="{errors.range}")
	private String hobbies;
	
	@NotNull(message="{errors.required}")
	@Size(min=5, max=200, message="{errors.range}")
	private String declaration;

	public Long getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(Long registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(String languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	public Long getPrimaryContactNumber() {
		return PrimaryContactNumber;
	}

	public void setPrimaryContactNumber(Long primaryContactNumber) {
		PrimaryContactNumber = primaryContactNumber;
	}

	public Long getWhatsAppContactNumber() {
		return whatsAppContactNumber;
	}

	public void setWhatsAppContactNumber(Long whatsAppContactNumber) {
		this.whatsAppContactNumber = whatsAppContactNumber;
	}

	public Long getAlternateContactNumber() {
		return alternateContactNumber;
	}

	public void setAlternateContactNumber(Long alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}

	public String getTravellingFrom() {
		return travellingFrom;
	}

	public void setTravellingFrom(String travellingFrom) {
		this.travellingFrom = travellingFrom;
	}

	public String getPassportCopy() {
		return passportCopy;
	}

	public void setPassportCopy(String passportCopy) {
		this.passportCopy = passportCopy;
	}

	public String getLatestPhoto() {
		return latestPhoto;
	}

	public void setLatestPhoto(String latestPhoto) {
		this.latestPhoto = latestPhoto;
	}

	public Boolean getPracticingYoga() {
		return practicingYoga;
	}

	public void setPracticingYoga(Boolean practicingYoga) {
		this.practicingYoga = practicingYoga;
	}

	public Boolean getPracticingWithSpyss() {
		return practicingWithSpyss;
	}

	public void setPracticingWithSpyss(Boolean practicingWithSpyss) {
		this.practicingWithSpyss = practicingWithSpyss;
	}

	public String getHowDidYouKnow() {
		return howDidYouKnow;
	}

	public void setHowDidYouKnow(String howDidYouKnow) {
		this.howDidYouKnow = howDidYouKnow;
	}

	public String getBranchOfPractice() {
		return branchOfPractice;
	}

	public void setBranchOfPractice(String branchOfPractice) {
		this.branchOfPractice = branchOfPractice;
	}

	public String getMainTeacherName() {
		return mainTeacherName;
	}

	public void setMainTeacherName(String mainTeacherName) {
		this.mainTeacherName = mainTeacherName;
	}

	public Boolean getAttendedSpyssCampsBefore() {
		return attendedSpyssCampsBefore;
	}

	public void setAttendedSpyssCampsBefore(Boolean attendedSpyssCampsBefore) {
		this.attendedSpyssCampsBefore = attendedSpyssCampsBefore;
	}

	public String getCountriesTravelled() {
		return countriesTravelled;
	}

	public void setCountriesTravelled(String countriesTravelled) {
		this.countriesTravelled = countriesTravelled;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getDeclaration() {
		return declaration;
	}

	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}

}
