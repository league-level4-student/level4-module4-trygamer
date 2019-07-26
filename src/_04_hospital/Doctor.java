package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
Hospital h = new Hospital();
ArrayList<Patient> d = new ArrayList<Patient>();
//Patient p = new Patient();



	public Object performsSurgery() {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException{
		// TODO Auto-generated method stub
		if(d.size()<3) {
			d.add(patient);
		}
		else {
			
			throw new DoctorFullException();
		}
		
		}
		
			
			
			
		
		
		
	

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < d.size(); i++) {
			 d.get(i).cf=true;
			
		}
		
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return d;
	}



}
