package pep;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// Zadatak IF sa znanje.org
		//Ucitati x. Ako je x manje ili jednako 0,
		// tada je y=5+x, inace je y=x-3
		Scanner sc= new Scanner(System.in);
		int x, y=0;
		System.out.println("Unesi x: ");
		x=sc.nextInt();
		
		if (x<=0) {
			y=5+x;
			System.out.println("Y je: "+y);
		}
		else {
			y=x-3;
			System.out.println("Y je: "+y);
		}
		
	}

}
