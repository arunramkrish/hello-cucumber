package com.abddhospital.bdd.hello_cucumber.day3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.naming.directory.SearchResult;

import com.abddhospital.bdd.hello_cucumber.day2.model.Patient;
import com.abddhospital.bdd.hello_cucumber.day2.model.Prescription;
import com.abddhospital.bdd.hello_cucumber.day2.model.User;
import com.abddhospital.bdd.hello_cucumber.day2.service.PatientService;
import com.abddhospital.bdd.hello_cucumber.day2.service.PrescriptionService;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPrescriptionSteps {
	private String loggedInUser;
	private PatientService patientService = new PatientService();
	private PrescriptionService prescriptionService = new PrescriptionService();
	private String hkId;
	private String caseNumberToSearch;
	private List<Prescription> searchResult;
	
	@Given("User is logged in as {string}")
	public void loginUser(String userId) {
		userId = loggedInUser;
	}
	
	@Given("Following patients exist")
	public void existingPatients(DataTable dataTable) {
		List<Patient> patients = dataTable.asList(Patient.class);
		for (Patient p : patients) {
			patientService.addPatient(p);
		}
	}
	@Given("Following cases exist")
	public void existingPrescriptions(DataTable dataTable) {
		List<Prescription> prescriptions = dataTable.asList(Prescription.class);
		for (Prescription p : prescriptions) {
			prescriptionService.addPrescription(p);
		}
	}
	
	@Given("user specifies HK Id as {string}")
	public void enterHkId(String hkId) {
		this.hkId = hkId;
	}
	
	
	@Given("Case number as {string}")
	public void enterCaseNumber(String caseNumber) {
		this.caseNumberToSearch = caseNumber;
	}
	
	@When("The user invokes search prescription")
	public void searchPrescription() throws Throwable{
		searchResult = prescriptionService.search(this.hkId, this.caseNumberToSearch);
	}
	
	@Then("User sees following prescription")
	public void then(DataTable dataTable) throws Throwable {
		List<Prescription> prescriptions = dataTable.asList(Prescription.class);
		//TODO compare prescriptions
		assertArrayEquals(prescriptions.toArray(), searchResult.toArray());
	}

}
