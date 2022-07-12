import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		
		Scanner entry = new Scanner(System.in);
		
		num = entry.nextInt();
		
		entry.close();
		
		if(num % 2 == 0)
			System.out.println("Even Number!");
		else
			System.out.println("Odd Number!");

	}

}
