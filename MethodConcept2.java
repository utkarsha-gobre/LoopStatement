package Study;

public class MethodConcept2 {

	public static void main(String[] args) {
		
		MethodConcept2 mc2 = new MethodConcept2();
		
       mc2.login();
      mc2.selectproduct();
      mc2.selectproduct();
      mc2.selectproduct();
      mc2.selectproduct();
      mc2.selectproduct();
      mc2.selectproduct();
     
      mc2.deliver();
	}
		 

	public void login()
	{
		System.out.println("Login Succesfully");
		
	}
	public void selectproduct()
	{
		System.out.println("Product has bem Selected");
	}
	public void select() {
		System.out.println("Payment deliver succesfully");
	}
	public void deliver() {
		System.out.println("Product has been deliver");
	}
	}