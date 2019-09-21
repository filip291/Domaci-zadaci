package pep;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		//Ispisati prirodne brojeve od 1 do 17 
		//koji nisu djeljivi sa a.
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesi a: ");
		int a=sc.nextInt();
		for (int i=1; i<=17; i++) {
			if (i%a==0) {
				System.out.println(i);
			}
		}
	}

}
