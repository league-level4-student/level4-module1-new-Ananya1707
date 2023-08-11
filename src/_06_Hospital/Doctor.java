package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient> list = new ArrayList<Patient>();
	
	public Doctor() {
		
	}
	
	public void doMedicine() {
		for(int i = 0; i<list.size(); i++) {
			list.get(i).checkPulse();
		}
		
	}
	
	public void assignPatient(Patient p) throws DoctorFullException{
		if(list.size() < 3) {
			list.add(p);
		}else {
			throw new DoctorFullException();
		}

	}
	
	public ArrayList<Patient> getPatients() {
		return list;
		
	}

}
