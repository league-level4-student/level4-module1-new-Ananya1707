package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	ArrayList<Patient> unassignedPatientList = new ArrayList<Patient>();
	
	public Hospital() {
		
	}
	
	public void addPatient(Patient p) {
		unassignedPatientList.add(p);
		
	}
	
	public ArrayList<Patient> getPatients() {
		
		return unassignedPatientList;
		
	}
	
	public void addDoctor(Doctor d) {
		
		doctorList.add(d);
		
	}
	
	public ArrayList<Doctor> getDoctors() {
		
		return doctorList;
		
	}

	public void assignPatientsToDoctors(){
		for(int i = 0; i < doctorList.size();i++) {
			for(int j = unassignedPatientList.size()-1; j>=0; j--) {
				try {
					doctorList.get(i).assignPatient(unassignedPatientList.get(j));
					unassignedPatientList.remove(j);
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					break;
				}
			}

		}
	}
	
	

}
