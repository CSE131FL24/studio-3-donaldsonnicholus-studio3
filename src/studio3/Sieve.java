package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Choose n value");
		int n = in.nextInt(); 
		boolean[] primeNumbers = new boolean[n+1];
		
		
		for (int i = 2; i < n; i++) {
			primeNumbers[i] = true;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (primeNumbers[i] == true) {
				for (int j = i * i; j <= n; j = j + i) {
					primeNumbers[j]  = false;
				}
			}
			
			 
		}
		for (int i = 2; i < n; i++) {
			if (primeNumbers[i] == true) {
				System.out.print(i + ", ");
			}
	}

}
}
