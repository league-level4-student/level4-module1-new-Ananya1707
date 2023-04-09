package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	char c;
    	String backwards = ""; 
    	for  (int i  = 0; i < unfunkifiedText.length(); i++) {
    		c = unfunkifiedText.charAt(i);
    		backwards = c + backwards;
    	}

        return backwards;

    }
}
