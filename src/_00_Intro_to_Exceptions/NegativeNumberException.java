package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	
	static void scaryPopup(){
		JOptionPane.showMessageDialog(null, "you have tiggered a critical error in your computer.");
	}
	
	public static void testPositive(int num) throws NegativeNumberException {
		if(num<0) {
			throw new NegativeNumberException();
			
		}
	}
	
    public static void main(String[] args) {
    	try {
			testPositive(-1);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			scaryPopup();
		} finally {
			JOptionPane.showMessageDialog(null, "your computer is okay.");
		}
    }


}
