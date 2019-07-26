package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

//Doctor das= new  Doctor();
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
		int dn = 0;
	//	Doctor d1 = gp.get(0);
		System.out.println(p.size()+" patients");
		for (int i = 0 ; i< p.size();i++) {
			
			
			try {
				Doctor d1 = gp.get(dn);
				d1.assignPatient(p.get(i));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				i-=1;
				dn++;
				System.out.println(dn+"doctor");
			}
			
			
			
		
					}
					
					
				}
					
				
						
						
						
					
					
					
				
				
				
		
			
			
			
			
		
		
	

	public void addDoctor(Doctor generalPractitioner) {
		// TODO Auto-generated method stub
		
		
		gp.add(generalPractitioner);
		
		
	}

	

	





}
