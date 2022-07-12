import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Largest of Two Numbers" +"\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int x = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int y = sc.nextInt();
		
			
		int lar = (x > y) ? x : y;
			
			System.out.println("Largest of (" + x + ", " + y + ") = " + lar);
		}

	}


