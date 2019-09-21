package dp;

import java.util.Scanner;


public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. 
		 * Primer niza: 3 54 123 18 
		 * Ispis: 18 123 54 3
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesi duzinu niza: ");
		int n;
		int i;
		n=sc.nextInt();
		int[] niz= new int[n];
		
		for ( i=0; i<niz.length; i++) {
			System.out.println("Unesi elemente niza: ");
			niz[i]=sc.nextInt();
			
		}
		System.out.println("Niz u originalnom redosledu je: ");
		for (i=0; i<niz.length;i++) {
			
			System.out.print(niz[i]+" ");
			
		}
		System.out.println();
		System.out.println("Niz u inverznom redusledu je: ");
		for (i=n-1; i>=0; i--) {
			System.out.print(niz[i]+" ");
		}
		
	}

}
