package com.abddhospital.bdd.hello_cucumber.day2.dao;

import java.util.ArrayList;
import java.util.List;

import com.abddhospital.bdd.hello_cucumber.day2.model.Prescription;

public class PrescriptionDao {
	private List<Prescription> inmemoryPrescriptionsStore = new ArrayList<Prescription>();

	public void add(Prescription p) {
		inmemoryPrescriptionsStore.add(p);		
	}

	public List<Prescription> findByExample(Prescription example) {
		List<Prescription> result = new ArrayList<Prescription>();
		for (Prescription p : inmemoryPrescriptionsStore) {
			if ((example.getPatientId() != null) && (!(example.getPatientId().contentEquals(p.getPatientId()))))
				continue;
			if ((example.getCaseNumber() != null) && (!(example.getCaseNumber().contentEquals(p.getCaseNumber()))))
				continue;
			result.add(p);
		}
		return result;
	}
	
}
