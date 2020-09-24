package com.abddhospital.bdd.hello_cucumber.day2;

import java.util.Map;

import com.abddhospital.bdd.hello_cucumber.day2.model.Patient;
import com.abddhospital.bdd.hello_cucumber.day2.model.Prescription;
import com.abddhospital.bdd.hello_cucumber.day2.model.User;

import io.cucumber.java.DataTableType;

public class TypeDefinitions {
	@DataTableType
	public User userEntry(Map<String, String> entry) {
		return new User(entry.get("firstName"), entry.get("lastName"), entry.get("title"));
	}

	@DataTableType
	public Patient patientEntry(Map<String, String> entry) {
		return new Patient(entry.get("patientId"), entry.get("patientName"), entry.get("mobile"));
	}
	
	@DataTableType
	public Prescription prescriptionEntry(Map<String, String> entry) {
		return new Prescription(entry.get("patientId"), entry.get("caseNumber"), entry.get("caseDate"), entry.get("drugName"), entry.get("dose"));
	}
	

}
