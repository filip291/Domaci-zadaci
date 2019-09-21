package pep;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// Izracunaj sumu parnih prirodnih brojeva
		// u intervalu od k do n
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite brojeve k i n");
		int k=sc.nextInt(), n=sc.nextInt();
		int sum=0;
		int i=k;
		while (i<=n) {
			if (i%2==0) 
				sum+=i;
				i++;
			
			
		}
		System.out.println("Zbir parnih brojeva je: "+sum);
		

	}	
}
	


