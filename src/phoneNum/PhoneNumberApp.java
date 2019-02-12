package phoneNum;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and retrieve a phone number
		
		
		
		String filename = "src/PhoneNum/PhoneNumber";
		
		File file = new File(filename);
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			phoneNum = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error: could not read the file");
		}
		
		// Valid phone number is :
					// 9 digits long
				
					// Cannot start from 0 
				
					//Cannot equals to 997,998,999
		
		//System.out.println(phoneNum.substring(0, 1));
		
		try {
			if(phoneNum.length() != 9) {
				throw new NineDigitsException(phoneNum);
			}
			if(phoneNum.substring(0, 1).equals("0") ) {
				throw new ZeroStartException(phoneNum);
			}
			for(int i = 0; i<phoneNum.length()-2;i++) {
				if(phoneNum.substring(i, i+1).equals("9")) {
					if(phoneNum.substring(i+1, i+3).equals("97") || phoneNum.substring(i+1, i+3).equals("98") || phoneNum.substring(i+1, i+3).equals("99")) {
						throw new EmergencyException(phoneNum);
					}
				}
				
			}
			System.out.println(phoneNum);
		} catch (NineDigitsException e) {
			System.out.println("Error: Phone number must has 9 digits !");
			System.out.println(e.toString());
		}
		  catch (ZeroStartException e) {
			System.out.println("Error: Phone number cannot start with zero !");  
		} catch (EmergencyException e) {
			System.out.println("Error: Phone number cannot equals to Emergency number !");
			System.out.println(e.toString());
		}

	}
	
}


