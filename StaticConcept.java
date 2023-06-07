package Study;

public class StaticConcept {
	static
	{
		System.out.println("THIS IS STATIC BLOCK");
	}
	{
		System.out.println("THIS IS INSTANCE BLOCK");
	}

	public static void main(String[] args) {
		StaticConcept sc = new StaticConcept();
		StaticConcept sc1 = null;
		sc1.demo();
	}
	
	public static void demo(){
		
		{
		
		System.out.println("THIS IS DEMO METHOD");
		}
	
		

	}
}
