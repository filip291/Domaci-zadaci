package tp;

import java.util.Scanner;

public class Zadatak_2_c_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n i k");
		int n, k, br, sum;
		n = sc.nextInt();
		k = sc.nextInt();
		br = n;
		sum = 0;
		while (n < k) {
			
			sum += n;
			n += 1;
			
		}
		
		if (k < n) {
			System.out.println("Greska");
		}
		
		else {
			System.out.println("Zbir je: " + sum);
		}
		
		
		
	}

}
