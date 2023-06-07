package Study;

import java.util.Scanner;

public class ParameterizedMethod {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your Name");
	String name = scan.nextLine();
	System.out.println("Please enter your address");
	String address = scan.nextLine();
	System.out.println("Please enter your Mobile Number");
	int mobnum = scan.nextInt();
	
	ParameterizedMethod pm = new ParameterizedMethod();
	 pm.createcontact(name,address);
	 
	}

	private void createcontact(String name, String address) {
		// TODO Auto-generated method stub
		
	}

	{	
	}

}
