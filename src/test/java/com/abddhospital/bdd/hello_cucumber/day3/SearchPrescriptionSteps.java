package com.abddhospital.bdd.hello_cucumber.day3;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
	
	@Given("User is logged in as {string}")
	public void loginUser(String userId) {
		userId = loggedInUser;
	}
	
	@Given("And Following patients exist")
	public void existingPatients(DataTable dataTable) {
		List<Patient> patients = dataTable.asList(Patient.class);
		for (Patient p : patients) {
			patientService.addPatient(p);
		}
	}
	@Given("And Following cases exist")
	public void existingPrescriptions(DataTable dataTable) {
		List<Prescription> prescriptions = dataTable.asList(Prescription.class);
		for (Prescription p : prescriptions) {
			prescriptionService.addPrescription(p);
		}
	}
	
	@When("user executes sum function")
	public void when() throws Throwable {
		sum = new Calculator().add(firstNum, secondNum);
	}

	@Then("the sum is {int}")
	public void then(int expectedAnswer) throws Throwable {
		assertEquals(expectedAnswer, sum);
	}

}
