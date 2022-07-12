import java.util.Scanner;

public class EvenOrOddNumbers {

	public static void main(String[] args) {
		System.out.println("Even or Odd Number" +"\n");
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x =sc.nextInt();
		
		if(x%2 == 0) {
			System.out.println("Even Number!");
		}if(x%2 == 1){
			System.out.println("Odd Number!");
			
		}

	}

}
