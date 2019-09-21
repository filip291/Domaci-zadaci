package dp;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neko broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj elemenata niza: ");
		int br;
		int n;
		n = sc.nextInt();
		int[] niz = new int[n];

		System.out.println("Unesi broj za deljenje elemenata niza: ");
		br = sc.nextInt();
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi elemente niza");
			niz[i] = sc.nextInt();
		}
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0) {
				System.out.println("Element niza deljiv sa " + br + " je " + niz[i]);
			}

		}
	}

}
