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

	public void assignPatientsToDoctors() {

		
	}
	
	

}
