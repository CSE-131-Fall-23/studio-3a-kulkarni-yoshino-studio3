package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number n: ");
		int n = in.nextInt();
		boolean[] prime =new boolean[n];
		
		

		
		for (int i=0;i< prime.length;i++) {
			prime[i] = true;
		}
		
		
		for (int i=2; i < n;i++) {
			for (int j=2;i*j<n;j++ ){
				prime[i*j] = false;
		
			}
		}
		for (int i=0;i<prime.length;i++) {
			if (prime[i] == true){
				System.out.println(i);
			}	
			
			
			}
	}

}
