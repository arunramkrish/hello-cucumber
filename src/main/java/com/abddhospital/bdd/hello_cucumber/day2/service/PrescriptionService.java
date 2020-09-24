package com.abddhospital.bdd.hello_cucumber.day2.service;

import java.util.List;

import com.abddhospital.bdd.hello_cucumber.day2.dao.PrescriptionDao;
import com.abddhospital.bdd.hello_cucumber.day2.model.Prescription;

public class PrescriptionService {
	
	private PrescriptionDao prescriptionDao = new PrescriptionDao();
	
	public void addPrescription(Prescription p) {
		
		prescriptionDao.add(p);
	}

	public List<Prescription> search(String hkId, String caseNumberToSearch) throws Exception {
		if (hkId == null) {
			throw new Exception("hkId is required");
		}
		if (caseNumberToSearch == null) {
			throw new Exception("caseNumber is required");
		}
		
		Prescription example = new Prescription(hkId, caseNumberToSearch, null, null, null);
		return prescriptionDao.findByExample(example);
	}

}
