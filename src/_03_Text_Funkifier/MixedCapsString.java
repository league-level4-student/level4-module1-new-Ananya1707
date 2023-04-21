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
		char c = 'c';
    	String mixed = "";
		for  (int i  = 0; i < unfunkifiedText.length(); i++) {
			if(i%2 == 0) {
				c = unfunkifiedText.charAt(i);


						
			}
    		
    	}
		return null;
	}

}
