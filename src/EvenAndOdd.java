
public class EvenAndOdd {

	public static void main(String[] args) {
		int n[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		System.out.println("Even Numbers!:" +"\n");
		
		for(int i=0;i<n.length;i++){
			if(n[i]%2 == 0) {
				System.out.println(n[i] );
			}
		}
		
		System.out.println("Odd Numbers!:");
		for(int i=0;i<n.length;i++) {
			if(n[i]%2!=0) {
				System.out.println(n[i]);
			}
		}

	}

}
