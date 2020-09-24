package com.abddhospital.bdd.hello_cucumber.day2.dao;

import java.util.ArrayList;
import java.util.List;

import com.abddhospital.bdd.hello_cucumber.day2.model.Patient;

public class PatientDao {
	private List<Patient> inmemoryPatientsStore = new ArrayList<Patient>();

	public void add(Patient p) {
		// TODO verify uniqueness
		inmemoryPatientsStore.add(p);
	}

}
