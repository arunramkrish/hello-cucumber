package com.abddhospital.bdd.hello_cucumber.day2.model;

public class Prescription {

	private String caseNumber;
	private String patientId;
	private String caseDate;
	private String drugName;
	private String dose;

	public Prescription(String patientId, String caseNumber, String caseDate, String drugName, String dose) {
		this.patientId = patientId;
		this.caseNumber = caseNumber;
		this.caseDate = caseDate;
		this.drugName = drugName;
		this.dose = dose;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getCaseDate() {
		return caseDate;
	}

	public void setCaseDate(String caseDate) {
		this.caseDate = caseDate;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}
	
}
