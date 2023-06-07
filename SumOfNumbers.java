package Study;

import java.util.Scanner;

public abstract class SumOfNumbers {

	public static void main(String[] args) {
		
	int x,y,sum;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Number;");
	
	Scanner sc1 = new Scanner(System.in);
	x = sc1.nextInt();
	System.out.println("Enter the Second Number;");
	
	Scanner sc2 = new Scanner(System.in);
	y = sc.nextInt();
	
	sum=sum(x,y);
	System.out.println("The sum od Two Number x and y is:"+sum);
	
	}
	//Method that calculate the sum
	public static int sum(int a, int b) 
	
	
	
	{
		int sum = a+b;
		return sum;
	}

}
