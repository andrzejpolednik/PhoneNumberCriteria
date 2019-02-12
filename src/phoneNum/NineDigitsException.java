package phoneNum;

public class NineDigitsException extends Exception {

	String num;
	
	
	public NineDigitsException(String num) {
		this.num = num;
	}
	
	public String toString() {
		
		return ("NineDigitsException: " + num);
	}
	
}
