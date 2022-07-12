import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		System.out.println("Check for Positive or Negative Numbers");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		
		
		if(x>0) {
			System.out.println("Number is a positive Integer");
		}if(x<0){
			System.out.println("Number is negative Integer");
		}
			
	}
		
}

	


