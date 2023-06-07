package Study;

public class ConstructorConcept2 {

	// variable declaration
	int EmpNo;
	
	public ConstructorConcept2(int EmpNo) 
	
	{
		
	this.EmpNo = 12345;
	System.out.println(EmpNo);


	}
	public static void main(String[] args) {
		
			
		
		ConstructorConcept2 mm = new ConstructorConcept2(55555);
		System.out.println(mm.EmpNo);
		
	}

}
