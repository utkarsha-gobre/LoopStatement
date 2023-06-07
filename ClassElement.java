package Study;

public class ClassElement
{
	int a;
	int b;
	
	String orgname = "SpeedwayTech";

	public static void main(String[] args )
	{
		
		ClassElement object = new ClassElement();
		
		
		object.a = 10;
		object.b = 20;
		int c;
		
		c = object.a+object.b;
		System.out.println(c);
		System.out.println(object.orgname);
	
		
	}

}
