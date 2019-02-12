package phoneNum;

public class ZeroStartException extends Exception {
	
	String num;
	
	public ZeroStartException(String num) {
		
		this.num = num;
	}
	
	public String toString() {
		
		return ("ZeroStartException: " + num);
		
	}

}
