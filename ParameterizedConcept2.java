package Study;

public class ParameterizedConcept2
{
	int empnumber = 44444;
	
	public static void main(String[] args) {
	
		ParameterizedConcept2 pc = new ParameterizedConcept2();
		
		String status = pc.deposit();
		
		System.out.println("Transaction status is :"+status);
	}

	private String deposit() {
		System.out.println("Transaction is failed");
		return "fail";
	}

	
	}


