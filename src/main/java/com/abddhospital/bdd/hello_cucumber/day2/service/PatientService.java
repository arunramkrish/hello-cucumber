package com.abddhospital.bdd.hello_cucumber.day2.service;

import com.abddhospital.bdd.hello_cucumber.day2.dao.PatientDao;
import com.abddhospital.bdd.hello_cucumber.day2.model.Patient;

public class PatientService {
	private PatientDao patientDao = new PatientDao();
	
	public void addPatient(Patient p) {
		//TODO validate patient
		
		patientDao.add(p);
		
	}
	
}
