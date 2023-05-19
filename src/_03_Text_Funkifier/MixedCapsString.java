package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String allCaps = unfunkifiedText.toUpperCase();
    	String mixed = "";
		for  (int i  = 0; i < allCaps.length(); i++) {
			if(i%2 == 0) {
				mixed = mixed + allCaps.substring(i, i+1).toLowerCase();			
			}else {
				mixed = mixed + allCaps.substring(i, i+1);
			}
    		
    	}
		return mixed;
	}

}
