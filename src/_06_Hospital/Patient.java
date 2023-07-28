package _06_Hospital;

public class Patient {
	boolean pulseChecked = false;
	
	public Patient(){
		
	}
	
	public boolean checkPulse() {
		pulseChecked = true;
		return pulseChecked;
	}
	
	public boolean feelsCaredFor() {
		return pulseChecked;
	}

}
