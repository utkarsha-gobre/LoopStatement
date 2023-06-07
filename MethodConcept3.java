package Study;

public class MethodConcept3 {


	int empNumber = 44444;
	
	String data = "This is my empID: ";

	public static void main(String[] args) {
		MethodConcept3 mc = new MethodConcept3();
		System.out.println(mc.empNumber);
	     mc.printempNumber(12345);

	}

	public void printempNumber( int empNumber) {
		
		
		demo();
		System.out.println(data + empNumber);
	}

	private void demo() {
		
		System.out.println("THIS IS DEMO METHOD");
	}

}
