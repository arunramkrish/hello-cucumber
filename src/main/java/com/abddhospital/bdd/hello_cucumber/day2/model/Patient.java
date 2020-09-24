package com.abddhospital.bdd.hello_cucumber.day2.model;

public class Patient {

	private String mobile;
	private String patientId;
	private String patientName;

	public Patient(String patientId, String patientName, String mobile) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobile = mobile;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	
}
