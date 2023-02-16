import java.util.Scanner ;
public class perfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		System.out.println("This is the program that you can give nubers and it checks whether if its a"
				+ " perfect number or not.You can enter 1111 to end the program");
		int n ;
		
		int sum =0;
		do {
		System.out.print("Enter a number: ");
		 n = input.nextInt();
		 for( int i=1; i<n ; i++) {
			 for(int j =n; j>=1; j--) {
				 if(i*j==n) {
					 sum+=i;
				 }
			 }
			 
		 }
		if(sum==n) {
			System.out.println("It is a perfect number !");
			
		}
		else {
			System.out.println("It is not aperfect number !");
		}
		}
		while(n != 1111);
		
		
	
	}

}
