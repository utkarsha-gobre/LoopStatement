package Study;

public class nestedLoop {

	public static void main(String[] args) {
		int months = 30;

		int weeks = 3;
		int days = 7;
		
		//outer loop ptints weeks
		for(int i = 1;i <= weeks; ++i) {
			System.out.println("Week: " +i);
			
			// inner loop prints days
			for(int j = 1;j<= days;++j) {
				System.out.println("Days: "+j);
				
				//months added
				for(int k = 1; k<= months;++k) {
					System.out.println("Months ; "+k);
				}
			}
		}

	}

}
