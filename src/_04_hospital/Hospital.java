package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {


ArrayList<Doctor> gp = new ArrayList<Doctor>();
ArrayList<Patient> p = new ArrayList<Patient>();
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		
		p.add(patient);
		
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return p;
	}

	

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		
		
		return gp;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

	public void addDoctor(Doctor generalPractitioner) {
		// TODO Auto-generated method stub
		
		
		gp.add(generalPractitioner);
		
		
	}

	

	





}
