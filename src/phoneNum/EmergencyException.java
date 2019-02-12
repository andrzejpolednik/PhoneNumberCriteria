package phoneNum;

public class EmergencyException extends Exception {
	
	String num;
	
	
	public EmergencyException(String num) {
		this.num = num;
	}
	
	public String toString() {
		
		return ("EmergencyException: " + num);
	}
	
}
