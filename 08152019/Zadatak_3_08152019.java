package cp;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite stranice pravougaonika: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for (int i=1; i<=a; i++) {
			
			for (int j=1; j<=b; j++) {
				System.out.print('*');
			}
		System.out.println(" ");
		}
			
	}

}
