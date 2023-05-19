package _03_Text_Funkifier;

public class SwitchCapsString implements TextFunkifier{
	
	private String unfunkifiedText;

    public SwitchCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
    	String switched = "";
		for  (int i  = 0; i < unfunkifiedText.length(); i++) {
			String letter = unfunkifiedText.substring(i, i+1);
			if(letter.equals(letter.toUpperCase())) {
				switched = switched + letter.toLowerCase();		
			}else {
				switched = switched + letter.toUpperCase();
			}
    		
    	}

		return switched;
	}

}
