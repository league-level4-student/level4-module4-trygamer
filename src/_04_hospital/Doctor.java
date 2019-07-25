package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
Hospital h = new Hospital();
ArrayList<Patient> d = new ArrayList<Patient>();
//Patient p = new Patient();


try{ if(d.size()<3&&d.size()>=0) {
	
	
}
catch{
	
}
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException{
		// TODO Auto-generated method stub
		
			d.add(patient);
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
