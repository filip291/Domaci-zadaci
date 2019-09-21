package tp;

import java.util.Scanner;

public class Zadatak_2_b_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n: ");
		int n=sc.nextInt();
		int x=1;
		int sum=0;
		
		while (x<n) {
			
			sum+=x;
			x+=1;
		}
		System.out.println("Zbir brojeva je: "+sum);
	}

}
