package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient> list = new ArrayList<Patient>();
	
	public Doctor() {
		
	}
	
	public void doMedicine() {
		
	}
	
	public void assignPatient(Patient p) throws DoctorFullException{
		if(list.size() < 3) {
			list.add(p);
		}

	}
	
	public ArrayList<Patient> getPatients() {
		return list;
		
	}

}
