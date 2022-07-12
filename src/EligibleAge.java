public class EligibleAge {


	public static void main(String[] args) {
		System.out.println("Voters Eligiility check" + "\n");
		
		//Scanner in = new Scanner(System.in)
		//System.out.println("Enter the Voter's Age : ");
		
		int age = 17;
		
		if(age>=18) {
			System.out.println("Voter is " +age+ " and eligible to Vote");
		}else {
			System.out.println("Voter is not Eligible");
		}
		
		

	}

}
